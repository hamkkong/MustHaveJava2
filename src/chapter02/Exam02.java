package chapter02;

public class Exam02 {  // 에러 발생 예제 1

    public static void main(String[] args) {
	int num1 = 1;
	byte num2 = 1;
	byte num3 = 127;  //자동 형변환 (int -> byte)
	byte num4 = 128;  //에러 발생 (상수가 변수저장값보다 큼)
	
	short num5 = 1;
	
	num2 = num5;  //에러 발생 
	num2 = (byte)num5; // 프로그래머가 인위적으로 명시함;
	                   // 변수안의 값을 알고 있으니 줄여달라.ok
	

    }

}
