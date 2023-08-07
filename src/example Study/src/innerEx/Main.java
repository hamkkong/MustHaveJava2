package innerEx;

public class Main {

    public static void main(String[] args) {
	// 스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
	PocketBall.PocketMonster pokemon = new PocketBall.PocketMonster();
	System.out.println(pokemon.level);
	System.out.println(PocketBall.PocketMonster.name);
	                          
	
	
	//클래스, 정적 내부클래스, 정적 메서드()
	PocketBall.PocketMonster.getPoketMember();
    }
}
