// 인스턴스 생성과 관계 없이 static 변수가 메모리 공간에 할당될 때 실행이 된다.
// 인스턴스 만들지 말고 클래스로 대입하면 됨!
import java.util.Random; //임포트  (임의의 수 만드는 유틸리티)

public class Exam02_Preload {
    
   static int num;    // 스태틱 멤버 변수
   
   // static 초기화 블록 
   static {
      Random rand = new Random();  // 임포트용 새 인스턴스 생성; (main()실행 전에 난숫값이 이미 대입)
      
      num = rand.nextInt(100);  // 얘가 마음대로 숫자 생성(0~99까지)
   }

   
    public static void main(String[] args) {
	System.out.println(num);  

    }

}
