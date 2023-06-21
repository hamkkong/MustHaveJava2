package chapter05;

public class Exam07_While {

    public static void main(String[] args) {
	
	int num =0;
	int count = 0;
	
	while ((num++) < 100) {
	    
	   // if((num % 5) != 0) || ((num % 7) != 0)
	    // continue;  // 5와 7의 배수가 아니면 위로 이동 
	    
	   if((num % 5) != 0 )
	       continue;
	   if((num % 7) != 0)
	       continue;
	   
	   count++;       //5와 7의 배수이면 실행
	   System.out.println(num);
	}
	System.out.println("count:" + count);
    }

}
