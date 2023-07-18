
public class MethodTest {
    int varTest(int a) {
	
	a++;
	return a;
    }

    public static void main(String[] args) {
	
	int a = 1;
	
	MethodTest m1 = new MethodTest();
	
	 
	a = m1.varTest(a);
	System.out.println(a);

    }

}
