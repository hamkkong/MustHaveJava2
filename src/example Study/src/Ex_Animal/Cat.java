package Ex_Animal;

public class Cat extends Animal{
    
    public Cat(String name, int age) { //생성자로 객체 만들어줌 
	
	super(name, age);
    }
    
    public void bark() {  // 메서드 오버라이딩
	System.out.println("야옹~");
    }
    
}
