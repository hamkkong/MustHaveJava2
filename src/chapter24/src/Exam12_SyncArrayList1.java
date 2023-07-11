import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exam12_SyncArrayList1 {
    
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args)throws InterruptedException {
	
	for (int i = 0; i<10; i++)
	    list.add(i);
	System.out.println(list);
	
	Runnable task = () -> {
	    ListIterator<Integer> itr = list.listIterator();
	    
	    while (itr.hasNext())
		itr.set(itr.next()+1);
	};
	
	ExecutorService pool = Executors.newFixedThreadPool(5);
	pool.submit(task);
	pool.submit(task);
	pool.submit(task);
	pool.submit(task);
	pool.submit(task);
	
	
	pool.shutdown();
	pool.awaitTermination(100, TimeUnit.SECONDS);
	
	System.out.println(list);
    }

}
