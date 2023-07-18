package Ex_Animal;

public abstract class Animal { //abstract 메서드를 포함한 클래스는 abstract화 시켜준다. 
    String name;
    int age;
    
    public Animal(String name, int age) { //생성자 생성  
	
	this.name = name;
	this.age = age;
    }
    
    public void move() {  // 움직임 메서드 
	System.out.println(this.name + " 이동한다");
    }
    public void eat() {  // 먹기 메서드 
	System.out.println(" 먹는다");
    }
    public abstract void bark();
	// 짖는 소리는 동물마다 다르므로 추상 메서드로 생성 
    
}
