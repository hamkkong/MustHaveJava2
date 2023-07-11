import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exam15_ConcurrentHashMap {
    public static Map<String, Integer> syncMap = null;
    public static Map<String, Integer> concMap = null;
    
    public static void performanceTest(final Map<String, Integer>target)
    throws InterruptedException {
	
	System.out.println("Start : "+Thread.currentThread().getName());
	Instant start = Instant.now();
	
	Runnable task = () -> {
	    for (int i = 0; i<100000; i++)
		target.put(String.valueOf(i),i);
	};
	
	ExecutorService pool = Executors.newFixedThreadPool(5);
	pool.submit(task);
	pool.submit(task);
	pool.submit(task);
	pool.submit(task);
	pool.submit(task);
	
	pool.shutdown();
	pool.awaitTermination(100, TimeUnit.SECONDS);
	
	Instant end = Instant.now();
	System.out.println("End : " + Duration.between(start, end).toMillis());
    }
    public static void main(String[] args) throws InterruptedException {
	syncMap = Collections.synchronizedMap(new HashMap<>());
	performanceTest(syncMap);
	
	concMap = new ConcurrentHashMap<>();
	performanceTest(concMap);

    }

}
