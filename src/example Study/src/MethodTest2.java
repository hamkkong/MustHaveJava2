
public class MethodTest2 {
    
    int a; //객체변수 a
    
   void varTest(MethodTest2 methodTest2) {
       

    methodTest2.a++;
   }

    public static void main(String[] args) {
	
	MethodTest2 methodTest2 = new MethodTest2();
	methodTest2.a = 1;
	methodTest2.varTest(methodTest2);
	System.out.println(methodTest2.a);
	
    }

}
