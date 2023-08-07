
public class InnerClass1 {

    public static void main(String[] args) {
	

	//Creature 클래스는 내부 클래스들의 외부 클래스
	
class Creature {
    
    int life;
    
    // Animal 클래스는 Creature 클래스의 내부 클래스 
    class Animal {
	
	
    }
    
    //Insect 클래스는 Creature 클래스의 내부 클래스 
    class Insect {
	
	
    }
    
    public void method() {
	
	Animal animal = new Animal();
	Insect insect = new Insect();
	  //
    } 
}

    }

}
