package arrayExam;

public class Ex03 { 

    public static void main(String[] args) {
	int arr[] = new int[26];  //길이가 26인 정수 배열 선언
	for (int i = 0; i<arr.length; i++) {
	    System.out.printf("%c", i+65);  //아스키영문자(대문자)를 순차적으로 초기화
	}
	System.out.println();

    }

}
