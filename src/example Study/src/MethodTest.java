
public class MethodTest {
    void varTest(int a) {
	
	a++;
    }

    public static void main(String[] args) {
	
	int a = 1;
	
	MethodTest m1 = new MethodTest();
	
	m1.varTest(a);
	System.out.println(a);

    }

}
