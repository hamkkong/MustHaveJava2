package shortgame;

public class Advanced extends PlayerLevel {

    @Override
    public void run() {
	System.out.println("빨리 달리기");
    }

    @Override
    public void jump() {
	System.out.println("점프 낮게 가능");
    }

    @Override
    public void turn() {
	System.out.println("회전 불가능");
    }

    @Override
    public void showLevel() {
	System.out.println("***중수입니다.***");
    }

}
