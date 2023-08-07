package innerEx;

public class PocketBall2 {
    int size = 100;
    int price = 5000;
    
    public void pocketMethod() {
	int exp = 5000;
	
	//메서드 내에서 클래스를 선언
	class PocketMonster2 {
	    String name = "이상해씨";
	    int level = 10;
	    
	    public void getPocketLevel() {
		System.out.println(level);  //인스턴스 변수 출력
		System.out.println(exp);  // 메서드 지역 상수 출력
	    }
	
	}
	
	//메서드 내에서 클래스를 선언 
	class PocketMonster3{
	    String name = "리자몽";
	    int level = 50;
	}
	
	new PocketMonster2().getPocketLevel();
	System.out.println("메서드 실행 완료");
    }
}
