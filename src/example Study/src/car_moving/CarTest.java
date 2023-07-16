package car_moving;


public class CarTest {     // 한번에 두 클래스를 불러와 진행시키는 메서드를 구현 

    public static void main(String[] args) {
	Car ai = new AICar();
	Car manual = new ManualCar();
	
	ai.run();
	System.out.println("===================================");
	manual.run();

    }

}
