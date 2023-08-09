package threadEx;

class Thread2 implements Runnable{
    
    public void run() {
	try {
	    	Thread.sleep(1000); //1초 대기 -> Runnable 로 구현한 경우 Thread 클래스 명시 
	} catch(Exception e) {
	    e.printStackTrace();
	}
    }
}
