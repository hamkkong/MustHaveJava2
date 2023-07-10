import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam08_ThreadPool1 {
    
    public static int money = 0;

    public static void main(String[] args) {
	
	Runnable task1 = () -> {    // 스레드에 시킬 작업 
	    for (int i = 0; i<10000; i++)
		money++;
	    String name = Thread.currentThread().getName();
	    System.out.println(name + " : " + money);
	};
	
	Runnable task2 = () -> {  // 스레드에 시킬 작업 
	    for (int i = 0; i<10000; i++)
		money--;
	    String name = Thread.currentThread().getName();
	    System.out.println(name + " : " + money);
	};
	
	ExecutorService pool = Executors.newSingleThreadExecutor();
	pool.submit(task1);   //스레드 풀에 작업을 전달 
	pool.submit(task2);   // 스레드 풀에 작업을 전달 
	
	System.out.println("End " + Thread.currentThread().getName());
	
	pool.shutdown();

    }

}
