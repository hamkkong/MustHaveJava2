package equals_EX;

public class HelloWorld {

    public static void main(String[] args) {
	Person p1 = new Person(10);
	Person p2 = new Person(10);
	
	System.out.println("p1 = p2 : " + (p1 == p2));
	System.out.println("p1.equals(p2) : " + (p1.equals(p2)));

    }

}
