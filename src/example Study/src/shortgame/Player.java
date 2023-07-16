package shortgame;

public class Player {
    private PlayerLevel level;
    
    public Player() {
	
	level= new Beginner(); // 생성자에서 level 객체를 생성한다. (비기너 설정을 이 클래스에서 잡아줌)
	level.showLevel();
    }
    
    public PlayerLevel getLevel() {   //레벨 객체를 가져다 쓰게 하는 게터
	return level;
	
    }
    public void upgradeLevel(PlayerLevel level) {  //레벨 객체를 대입하는 세터 
	this.level = level;  // 카운터 횟수의 증가에 따라 레벨도 증가한다 
	level.showLevel();
	
    }
    void play(int cnt) {
	
	level.go(cnt);  // 게터를 이용해 값을 가져다 쓰고 go 값을 오버라이딩해 cnt 값을 불러온다. 
    }

}
