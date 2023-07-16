package car_moving;

public class AICar extends Car{
    
    @Override
    public void drive() {
        System.out.println("자율 주행");
    }
    @Override
    public void stop() {
        System.out.println("자율 주차");
    }

    @Override
    public void wash() {
        System.out.println("자율 세차");
    }

}