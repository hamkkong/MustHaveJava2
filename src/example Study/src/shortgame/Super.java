package shortgame;

public class Super extends PlayerLevel {

    @Override
    public void run() {
	System.out.println("매우 빨리 달리기");
    }
    @Override
    public void jump() {
	System.out.println("점프 높게 가능");
    }
    
    @Override 
    public void turn(){
	System.out.println("회전 가능");
    }
    @Override 
    public void showLevel(){
	System.out.println("***고수입니다.***");
    }
    

}
