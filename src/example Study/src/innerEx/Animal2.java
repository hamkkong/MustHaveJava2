package innerEx;

interface Soundable {
    String makeSound();
}

public class Animal2{
    public static void main(String[] args) {
	Creature creature = new Creature();
	creature.method();
	creature.method2();
	
    }
}

class Creature { 
    private Soundable dog = new Soundable() {   // 익명 클래스 생성 
	@Override
	public String makeSound() {   
	    return "멍멍";
	}
    };
    
    public void method() {
	System.out.println(dog.makeSound());
    }
    
    public void method2() {
	System.out.println(dog.makeSound());
    }
}