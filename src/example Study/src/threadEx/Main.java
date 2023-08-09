package threadEx;

public class Main {

    public static void main(String[] args) {
	ThreadEX threadex = new ThreadEX();
	ThreadEX threadex2 = new ThreadEX();
	Thread thread1 = new Thread(threadex, "A");
	Thread thread2 = new Thread(threadex2, "B");
	
	thread1.start();
	thread2.start();
	
	Thread.currentThread().getName();

    }

}
