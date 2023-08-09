package threadEx;

public class ThreadEX implements Runnable{ //implements는 main()과 함께 작동이 안되므로 별개의 클래스로 작업할것!
    
    int TestNum = 0;
    @Override
    public /*Synchronized 하나가 끝나야 실행됨*/ void run() {
	for(int i=0; i<10; i++) {
	    if(Thread.currentThread().getName().equals("A")) {
		System.out.println("==========================");
		TestNum++;
	    }
	    System.out.println("ThreadName = " + Thread.currentThread().getName()+"testNum = " +TestNum);
	    try {
			Thread.sleep(500);
	    } catch (InterruptedException e) {
		e.printStackTrace();
		
	    }
	}
    }
}
