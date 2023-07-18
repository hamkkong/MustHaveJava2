class Parent{}
class Child extends Parent {}

public class InstanceofTest {

    public static void main(String[] args) {
	Parent parent = new Parent();
	Child child = new Child();
	
	System.out.println(parent instanceof Parent);
	System.out.println(child instanceof Parent);
	System.out.println(parent instanceof Child);
	System.out.println(child instanceof Child);
    }

}
