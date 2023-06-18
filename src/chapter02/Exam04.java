package chapter02;

public class Exam04 {  // 에러 발생 예제 3

    public static void main(String[] args) {
	
	byte num11 = 1;
	byte num12 = 2;
	byte result1 = num11 + num12;  // 에러 발생 
	
	Short num21 = 1;
	Short num22 = 2;
	Short resurt21 = num21 + num22 ; // 에러 발생 
	
	
	Short resurt22 = (short)(num21+num22); //강제 형변환 

    }

}
