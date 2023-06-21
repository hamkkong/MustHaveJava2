package chapter05;

public class Exam06_ForExtension {

    public static void main(String[] args) {
	// 2의 배수 출력

	int i = 0;
	for (; i < 10; i++) { // 초기식 생략
	    if (i % 2 == 0) // 2의 배수이면
		System.out.print(i + " ");
	}
	System.out.println();

	i = 0;
	for (; i < 10;) { // 초기화
	    if (i % 2 == 0) // 초기식, 증감식 생략
		System.out.print(i + " ");

	    i++; // 증감
	}
	System.out.println();

	for (int j = 0; j < 10; j = j + 2) { // 증감 대신 연산 수식 
	    System.out.print(j + " ");
	}
	System.out.println();

    }

}
