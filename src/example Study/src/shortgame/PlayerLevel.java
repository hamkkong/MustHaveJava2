package shortgame;

public abstract  class  PlayerLevel {
    	public abstract void run();
    	public abstract void jump();
    	public abstract void turn();
    	public abstract void showLevel();
    	public final void go(int cnt) {  // 카운트 횟수가 증가하면서 레벨도 높아짐
    	    
    	    run();
    	    for (int i=0; i<cnt; i++) {
    		
    		jump(); //카운트 횟수만큼 점프 수도 증가함 
    	    }
    	    turn();
    	    showLevel(); // 초보자, 중수, 고수 판별 
    	};

}
