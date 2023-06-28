interface Cry {
    
    void Cry();
}

class Cat implements Cry {
    
    public void Cry() {
	System.out.println("야옹~");
    }
}
class Dog implements Cry {
    
    public void Cry() {
	System.out.println("멍멍!");
    }
}

public class Exam07_Instanceof {

    public static void main(String[] args) {
	
	Cry test1 = new Cat();
	// Cry test1 = new Dog();
	
	if (test1 instanceof Cat) {
	    
	    test1.Cry();
	}
	else if (test1 instanceof Dog) {
	    
	    System.out.println("고양이가 아닙니다.");
	}

    }

}
