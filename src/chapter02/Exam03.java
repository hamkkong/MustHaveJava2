package chapter02;

public class Exam03 {  //에러 발생 예제 2

    public static void main(String[] args) {
	int num1 = 2147483647;   // ok
	int num2 = 2147483648;   // 에러 발생
        long num3 = 2147483648;   //에러 발생
        long num4 = 2147483648L;   /ok
        
        float num5 = 1.0;    // 에러 발생
        float num6 = 1.0F;   //
        
        double num7 = 30;    // int -> double 자동 형변환 
    }

}
