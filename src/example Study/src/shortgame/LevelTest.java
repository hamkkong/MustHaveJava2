package shortgame;

public class LevelTest {

    public static void main(String[] args) {
	Player player = new Player();  // 새로운 인스턴스 객체 생성 (비기너의 정보는 Player 클래스에 담김)
	player.play(1);
	
	Advanced adv = new Advanced();
	player.upgradeLevel(adv);
	
	player.play(2);
	
	Super sup = new Super();
	player.upgradeLevel(sup);
	
	player.play(3);
 
    }

}
