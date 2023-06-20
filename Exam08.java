package chapter03;

public class Exam08 {

    public static void main(String[] args) {
	
	int num1 = 50;
	int num2 = 100;
	
	int big = (num1 > num2) ? num1 : num2; //false
	System.out.println("큰 수 : " + big);
	
	int diff = (num1 > num2) ? (num1-num2) : (num2 - num1); // false
	System.out.println("두 수의 차 : " + diff);
	
   
    }

}
 