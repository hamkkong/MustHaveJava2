package chapter06;

public class Exam02_ReturnForExit {

    public static void main(String[] args) {

	divide(4, 2);
	divide(6, 2);
	divide(8, 0);

    }

    public static void divide(int num1, int num2) {
	
	if (num2 == 0) { //num2(정수) 0으로 나눌 수 없다.
	    
	    System.out.println("0으로 나눌 수 없습니다.");
	    return;
	}
	
	 System.out.println("나눗셈 결과 : " + (num1 / num2));
    }

}
