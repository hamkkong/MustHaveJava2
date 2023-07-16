import java.util.Scanner;
public class Calculator2 {

    public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	
	while (true) {
	    showMenu();
	    
	    //int num = sc.nextInt();
	    String input = sc.nextLine();
	    if (input.isEmpty()) {
	        System.out.println("   ");  // 공백 처리 및 16번 에러 커버
	        continue;
	    }
	    char myChar = input.charAt(0);

	    
	   // char myChar = sc.nextLine().charAt(0);
	    if(!checkNum(myChar)) {
		System.out.println("메뉴를 잘못 선택했습니다.");
		continue;
	    }
	    int num = myChar - '0';
	    System.out.println(num);
	    if (num == 0) {
		 System.out.println("계산기를 종료합니다. ");
		break;
	    }
	    else {
		if(num>4) {
		    System.out.println("메뉴를 잘못 선택했습니다.");
		    continue;
		}
		

		System.out.println("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		

		 if (num == 1) {
		    addNum(num1, num2);
		    
		}
		else if (num == 2) {
		    minusNum(num1, num2);
		    
		}
		else if (num == 3) {
		    multiplyNum(num1, num2);
		    
		}
		else if (num == 4) {
		    divideNum(num1, num2);
		    
		}
		
		
	    } 
	       
	    
	}
	
    }
    
    public static void showMenu() {
	
	System.out.println("메뉴를 선택하세요.");
	System.out.println("1.더하기");
	System.out.println("2.빼기");
	System.out.println("3.곱하기");
	System.out.println("4.나누기");
	System.out.println("0.끝내기");
	
    }
    
    public static void addNum(int num1, int num2) {
	int result = num1 + num2;
	System.out.println(num1 + " + " + num2 + " = " + result);
    }
    public static void minusNum(int num1, int num2) {
	int result = num1 - num2;
	System.out.println(num1 + " - " + num2 + " = " + result);
    }
    public static void multiplyNum(int num1, int num2) {
	int result = num1 * num2;
	System.out.println(num1 + " * " + num2 + " = " + result);
    }
    public static void divideNum(int num1, int num2) {
	int result1 = num1 / num2;
	System.out.println(num1 + " / " + num2 + " = " + result1);
	int result2 = num1 % num2;
	System.out.println(num1 + " % " + num2 + " = " + result2);
    }

    public static boolean checkNum(char ch) {
	
	if (ch>= '0' && ch<='9') {
	    
	    return true;
	}
	else {
	    return false;
	}
    }
}