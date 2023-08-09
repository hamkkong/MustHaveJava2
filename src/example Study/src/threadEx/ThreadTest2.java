package threadEx;

public class ThreadTest2 {

    public static void main(String[] args) {
	
	Thread2 runnable_th = new Thread2();
	
	Thread th = new Thread(runnable_th); // 클래스 객체 생성 후, 스레드 클래스에 생성한 객체 등록 
	th.start();

    }

}

