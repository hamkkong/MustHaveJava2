import java.util.Scanner;

public class Exam03_Factorial {

    public static void main(String[] args) {
	
	    System.out.print("팩토리얼 계산을 위한 정수값 입력 ");

	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    
	    int fac = 1; //초기값 설정 
	    
	   for (int i = num ; i > 0 ; i--) { // (int i=1, i<=num; i++) 동일한 조건식
	    
	       fac = fac * i; //fac *= i
	    
	     
	   }
	   System.out.println(num + "!="+ fac );
    }

}
