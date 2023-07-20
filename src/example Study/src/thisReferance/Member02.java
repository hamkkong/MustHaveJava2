package thisReferance;

class Method{
    int a = 10; int b = 20;  //인스턴스 변수
    int add() { return a + b ;}  //인스턴스 메서드 
    static int add(int x, int y) {return x + y;} //클래스 메서드 (static이 붙음)
    
}

public class Member02 {  
  
    public static void main(String[] args) {
	
	System.out.println(Method.add(20, 30));  //클래스 메서드의 호출(객체(인스턴스) 없이 바로 가져온다.)
	Method mymethod = new Method();   //인스턴스 생성 
	System.out.println(mymethod.add());   //인스턴스 메서드의 호출
    }
    
    //출력하는 형태를 잘 기억해 둘 것 !!! 
}
