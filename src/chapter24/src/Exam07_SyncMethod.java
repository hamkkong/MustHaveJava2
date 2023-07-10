public class Exam07_SyncMethod {
    
    public static int money = 0;
    
    public synchronized static void deposit() {
	
	money++;
    }
    public synchronized static void withdraw() {
	
	money--;
    }
    
    public static void main(String[] args) throws InterruptedException {
	Runnable task1 = () ->{
	    for (int i = 0; i<10000; i++)
		deposit();
	};
	
	Runnable task2 = () -> {
	    for (int i =0; i<10000; i++)
		withdraw();
	};
	
	Thread t1 = new Thread(task1);
	Thread t2 = new Thread(task2);
	
	t1.start();
	t2.start();
	
	t1.join();   // t1이 참조하는 스레드의 종료를 기다림
	t2.join();   // t2가 참조하는 스레드의 종료를 기다림
	
	// 스레드가 종료되면 출력을 진행함. 위 join의 영향
	
	System.out.println(money);

    }

}
