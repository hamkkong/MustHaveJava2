package innerEx;

public class Main2 {
    
    // 스태틱 필드 변수
    static Integer num = new Integer(0);
    
    // 내부 인스턴스 클래스 
   class InnerClass {
       
   }
   
   // 내부 스태틱 클래스 
   static class InnerStaticClass {
       
   }
   

    public static void main(String[] args) {
	
	//스태틱 필드 변수는 유일해서 서로 같다
	Integer num1 = Main2.num;
	Integer num2 = Main2.num;
	System.out.println(num1 == num2); // true

	//생성된 내부 클래스 인스턴스는 서로 다르다
	Main2.InnerClass inner1 = new Main2().new InnerClass();
	Main2.InnerClass inner2 = new Main2().new InnerClass();
	System.out.println(inner1 == inner2); // false
	
	//생성된 내부 스태틱 인스턴스도 서로 다르다 
	Main2.InnerStaticClass static1 = new InnerStaticClass();
	Main2.InnerStaticClass static2 = new InnerStaticClass();
	System.out.println(static1 == static2); // false
    }

}
