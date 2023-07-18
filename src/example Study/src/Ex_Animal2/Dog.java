package Ex_Animal2;

public class Dog implements Animal {
    
    @Override
    public void move() {
	
	System.out.println("슥슥~~~");
    }
    
    @Override
    public void bark() {
	
	System.out.println("멍멍!!");
    }

    @Override
    public void eat() {
	System.out.println("쩝쩝~~");
	
    }
}
