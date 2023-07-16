class Parent2 {   private String work;
private String cleaning;
private String working;

// 메서드 오버라이딩 예제 
    
   public final void pro() {
       
        Parent2 pr2 = new Parent2();
        
        pr2.working = "업무중입니다.";
        pr2.cleaning = "청소중입니다.";
        
        pr2.info();
        	
    }
   
 


public void info() {
	
	System.out.println(this.working);
   }

}
class Child1 extends Parent2 {  
    
     String pro;
     String info;
    
    public void sub() {
	
	System.out.println("Sub");
	
	System.out.println(this.pro);
	System.out.println(this.info);
    }
    
}

public class Final01 {
    public static void main(String[] args) {
	
	
	Child1 ch1 = new Child1(); 
	
		ch1.info(); 
		ch1.pro();   
		ch1.sub(); 
    }
    
}


    

