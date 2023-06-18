package chapter02;

public class Exam05 {  // 자동 형변환 (에러 발생 예제 4)

    public static void main(String[] args) {
	
	int num31 = 1;
	int num32 = 2;
	int result3 = num31 + num32;   // ok
	
	long num41 = 1;
	long num42 = 2;
	long result4 = num41+num42;   // ok
	
	long result5 = num31 + num41;  // ok 자동 형변환 
	
	float num61 = 1.0f;
	float num62 = 2.0f;    // f 접미사 
	float result6 = num61 + num62;   // ok 
	
	double num71 = 1.0;
	double num72 = 2.0;
	double result7 = num71 + num72;  // ok
	
	double result8 = num61 +num71;   // ok 자동 형변환
    }

}
