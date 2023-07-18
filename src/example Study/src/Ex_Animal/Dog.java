package Ex_Animal;

public class Dog extends Animal{

    public Dog(String name, int age) {   // 생성자 만들어서 상속
	
	super(name, age);
   }
    
    @Override
    public void bark() {  // 메서드 오버라이딩 
	System.out.println("멍멍!!");
    }
}
