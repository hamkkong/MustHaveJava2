package car_moving;

public class ManualCar extends Car{
    
    @Override
    public void drive() {
	System.out.println("수동 주행");
    }
    
    @Override
    public void stop() {
	System.out.println("수동 주차");
    }
    
   
}