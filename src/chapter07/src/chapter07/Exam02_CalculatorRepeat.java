package chapter07;

import java.util.Scanner;   //입력 처리 클래스 
public class Exam02_CalculatorRepeat {

    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);  //입력 처리 객체 
	
	while (true)  { // 반복 
	    
	showMenu();   //메뉴 출력
	
	String input = sc.nextLine();
	if (input.isEmpty()) {
	    System.out.println("메뉴를 잘못 선택했습니다.");//입력받기 메서드
	    
	    continue;
	}
	
	char myChar = input.charAt(0);
	if (!checkNum(myChar)) {
	    System.out.println("메뉴를 잘못 선택했습니다.");
	   
	   continue;
	}
	int num = Character.getNumericValue(myChar);
	
	if (num == 0) {  // (값이 0일때) 반복문 종료
	    
	    break;
	}
	else {
	    
	    if (num>4) {  //값을 4 이상으로 선택했을때 알림이 출력 
		System.out.println("메뉴를 잘못 출력했습니다.");
		continue;
	    }
	    
	    // 더하기, 빼기, 곱하기, 나누기 실행 
	   System.out.print("첫 번째 숫자 : ");
	   int num1 = sc.nextInt();

	   System.out.print("두 번째 숫자 : ");
	   int num2 = sc.nextInt();
	   sc.nextLine();
	   
	   if (num == 1)
	       addNum(num1, num2);
	   else if (num == 2)
	       minusNum(num1,num2);
	   else if (num == 3)
	       multiplyNum(num1,num2);
	   else if (num == 4)
	       divideNum(num1, num2);   // 중괄호 생략 
	   
	   
	  }
       }
	System.out.println("계산기를 종료합니다.");  //종료 메시지 
	    
    }
    
	public static void showMenu() {
	
	    System.out.println("메뉴를 선택하세요.");
	    System.out.println("1.더하기");
	    System.out.println("2.빼기");
	    System.out.println("3.곱하기");
	    System.out.println("4.나누기");
	    System.out.println("0.끝내기");
		
	}
	
	public static void addNum(int num1, int num2) {  // 더하기 
	    
	    int result = num1 + num2;
	    System.out.println(num1 + " + " + num2 +" = " + result);
	}
	
	
	public static void minusNum(int num1, int num2) {  // 빼기 
	    
	    int result = num1 - num2;
	    System.out.println(num1 + " - " + num2 +" = " + result);
	}
	
	public static void multiplyNum(int num1, int num2) {  // 곱하기 
	    
	    int result = num1 * num2;
	    System.out.println(num1 + " * " + num2 +" = " + result);
	}
	
	public static void divideNum(int num1, int num2) {  // 나누기 
	    int result1 = num1 / num2;
	    System.out.println(num1 + " / " + num2 +" = " + result1);
	    
	    int result2 = num1 % num2;
	    System.out.println(num1 + " % " + num2 +" = " + result2);
	}
	
	public static boolean checkNum(char ch) {
	    
	    if (ch >= '0' && ch <= '9')  {
		
		return true;
	    }
	    else  {
		return false;
	    }
	}

}
