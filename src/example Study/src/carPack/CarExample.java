package carPack;

public class CarExample {

    public static void main(String[] args) {
	Car myCar = new Car(); //객체 생성
	
	//잘못된 속도 변경
	myCar.setSpeed(-50);
	System.out.println("현재 속도 : " + myCar.getSpeed()); //0 출력 
	
	//올바른 속도 변경
	myCar.setSpeed(60);
	
	// 멈춤 
	if (!myCar.isStop()) {
	    
	    myCar.setStop(true);
	}
	System.out.println("현재 속도 : " + myCar.getSpeed()); //0 출력 

    }

}
