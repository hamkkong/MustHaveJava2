package chapter07;

import java.util.Scanner;// 입력 처리 클래스

public class Exam01_MyCalculator {

    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in); // 입력 처리 객체 

	while (true) {     // 반복 
	showMenu(); // 메뉴 출력
	
	//int num = sc.nextInt(); // 정수 입력받기 (Scanner활성시에만 사용가능) -기존 입력코
	
	String input = sc.nextLine();
	
	if (input.isEmpty()) {
	    System.out.println("입력이 비어있습니다. 다시 입력해주세요.");
	  continue;
	}
	
	char myChar = input.charAt(0); //새로운 입력 코드 ; 1글자만 입력 가능함  
	if(!checkNum(myChar)) {   // 숫자인지 확인
	    System.out.println("메뉴를 잘못 선택했습니다."); //false인 경우 실행됨 
	    continue;  
	}
	
	// int num = (int)myChar;// 숫자로 판명된 char 데이터를 바로 int형 데이터로 변환  
	//System.out.println(num);
	//int num = Character.getNumericValue(myChar);// char 형 숫자를 int형 숫자로 변환 
	int num = myChar - '0'; //
		System.out.println(num);
	
	if (num == 0) {
	    break;
	}
	else {
	    if(num > 4) {
		continue;
	    }
	    
	    // 더하기, 빼기, 곱하기, 나누기 실행 <-STEP4에서 코드를 작성할 위
	   System.out.println("첫 번째 숫자:"); //첫번째숫자 입력을 실행 
	   int num1 = sc.nextInt();
	   sc.nextLine(); //개행 문자 처리 

	   System.out.println("두 번째 숫자:"); //두번째숫자 입력을 실행
	   int num2 = sc.nextInt();
	   sc.nextLine(); //개행 문자 처리 
	   
	   if (num == 1)               //계산식에 해당하는  숫자 눌렀을때 계산식으로 연결 
	       addNum(num1, num2);
	   else if (num == 2)
	       minusNum(num1, num2);
	   else if (num == 3)
	       multiplyNum(num1, num2);
	   else if (num == 4)
	       divideNum(num1, num2);
	   
	}
	
    }
	System.out.println("계산기를 종료합니다."); // 종료 메시지 
  }

    public static void showMenu() {

	System.out.println("메뉴를 선택하세요.");
	System.out.println("1.더하기");
	System.out.println("2.빼기");
	System.out.println("3.곱하기");
	System.out.println("4.나누기");
	System.out.println("0.끝내기");

    }

    public static void addNum(int num1, int num2) { // 더하기

	int result = num1 + num2;
	System.out.println(num1 + "+" + num2 + "=" + result);
    }

    public static void minusNum(int num1, int num2) { // 빼기

	int result = num1 - num2;
	System.out.println(num1 + "-" + num2 + "=" + result);
    }

    public static void multiplyNum(int num1, int num2) { // 곱하기

	int result = num1 * num2;
	System.out.println(num1 + "*" + num2 + "=" + result);
    }

    public static void divideNum(int num1, int num2) { // 나누기

	int result1 = num1 / num2;
	System.out.println(num1 + "/" + num2 + "=" + result1);

	int result2 = num1 % num2;
	System.out.println(num1 + "%" + num2 + "=" + result2);
    }

    public static boolean checkNum(char ch) {

	if (ch >= '0' && ch <= '9') {

	    return true;
	} else {
	    return false; // char형데이터를 매개변수 받아 숫자 0~9 사이이면True 를 반환, 그렇지 않으면false 를 변환
	}
    }
}
