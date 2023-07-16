package shortgame;

public class Beginner extends PlayerLevel{

	    @Override
	    public void run() {
		System.out.println("천천히 달리기");
	    }
	    @Override
	    public void jump() {
		System.out.println("점프 불가능");
	    }
	    
	    @Override 
	    public void turn(){
		System.out.println("회전 불가능");
	    }
	    @Override 
	    public void showLevel(){
		System.out.println("***초보자입니다.***");
	    }
	    
	    
	
}
