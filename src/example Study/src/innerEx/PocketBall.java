package innerEx;

public class PocketBall {
    //인스턴스 변수
    
    int size = 100;
    static int price = 5000;
    
    
    // static 내부 클래스 
  static class PocketMonster {
       static String name = "이상해씨";
       int level = 10;
       
     
       
       public static void getPoketMember() {
	   
	   //외부 클래스 인스턴스 멤버 접근 불가능
	 //  System.out.println(size);  // 실행 안됨 
	 
	   // 외부 클래스 스태틱 멤버 접근 가능
	   System.out.println(price);
	   
	   //내부 클래스 멤버도 스태틱 멤버만 접근 가능
	   System.out.println(name);
	   //system.out.println(level);  // 실행 안됨 
	 
       }
   
    }

}
