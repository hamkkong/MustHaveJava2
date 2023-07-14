
public class Exam04_EvenSum {

    public static void main(String[] args) {
	int even = 0; //초기값 설정 (짝수)
	int odd = 0; //초기값 설정 (홀수)
	
	for (int i = 1; i<=100; i++) {
	    
	    if (i%2 == 0) { //짝수 조건식
		even += i; //even = even + i;
		
		
	    }
		else { // 홀수 조건식 (i%2 == 1 또는 i%2 != 0;)
			
		    odd += i;
			
		    }
		    
	    
	   
	}
	System.out.println("짝수 합" + even);  //결과 : 2550
	System.out.println("홀수 합" + odd);   //결과 : 2500

    } 

}
