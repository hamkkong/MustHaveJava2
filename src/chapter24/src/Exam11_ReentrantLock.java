import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    
    ReentrantLock myLock = new ReentrantLock();
    int money = 0;
    
    public void deposit() {
	
	myLock.lock();
	money++;
	myLock.unlock();
    }
    
    public void withdraw() {
	
	myLock.lock();
	money--;
	myLock.unlock();
    }
    public int balance() {
	
	return money;
    }
}
public class Exam11_ReentrantLock {
    
    public static BankAccount account = new BankAccount();

    public static void main(String[] args) throws InterruptedException {
	
	Runnable task1 = () -> {
	    for (int i = 0; i < 10000; i++)
		account.deposit();
	};
	
	Runnable task2 = () -> {
	    for (int i = 0; i < 10000; i++)
		account.withdraw();
	};
	
	ExecutorService pool = Executors.newFixedThreadPool(2);
	pool.submit(task1);
	pool.submit(task2);
	
	pool.shutdown();
	pool.awaitTermination(100, TimeUnit.SECONDS);
	
	System.out.println(account.balance());
	
    }

}
