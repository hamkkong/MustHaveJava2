package car_moving;

public abstract class Car {
    public abstract void drive();   // 두개의 클래스에서 각자 변경해서 사용해야 할 파일 

    public abstract void stop();    // 두 개의 클래스에서 각자 변경해서 사용해야 할 파일 

    public void startCar() {

	System.out.println("시동걸기");
    }

    public void turnoff() {
	System.out.println("시동끄기");
    }

    public void wash() {
    };

    // 템플릿 메서드

    public final void run() {   //run 이라는 템플릿 메서드를 구현했다.

	startCar();           // 이런 형태는 프레임워크에서 많이 사용되는 설계패턴이다.
	drive();              // 추상 클래스로 선언된 상위 클래스에서 추상 메서드를 이용하여 
	stop();               // 전체 구현의 흐름을 정의하고 
	turnoff();            //구체적인 각 메서드 구현은 하위 클래스에 위임한다.
	wash();
    }

}
