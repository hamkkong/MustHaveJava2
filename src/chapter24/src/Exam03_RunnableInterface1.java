class MyThread3 implements Runnable {
    
    public void run() {
	
	int sum = 0;
	for (int i =0; i<10; i++)
	    sum =sum + i;
	String name = Thread.currentThread().getName();
	System.out.println(name + ":" + sum);
    }
}
public class Exam03_RunnableInterface1 {

    public static void main(String[] args) {
	Thread t = new Thread(new MyThread3());
	t.start();
	
	System.out.println("main:" + Thread.currentThread().getName());

    }

}
