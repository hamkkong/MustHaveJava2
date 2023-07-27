package getClass_EX;

class A{}  // 클래스는 내용이 없는 경우에도 생성이 가능함 
class B{}
public class ClassEx01 {

    public static void main(String[] args) {
	A objA = new A();
	B objB = new B();
	System.out.println(objA.getClass());  // 결과 :class getClass_Ex.A
	System.out.println(objB.getClass());  // 결과 :class getClass_Ex.B
    }

}
