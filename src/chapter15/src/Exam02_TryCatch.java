import java.util.Scanner;
import java.util.InputMismatchException;

public class Exam02_TryCatch {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	try
	{
	    int num1 = sc.nextInt();  // 에러 발생 지점 
	    int num2 = 10/ num1;  // 에러 발생 지점 
	    System.out.println(num2);
	    System.out.println("Good bye~~!");
	}
	catch(ArithmeticException e) {  // 예외 처리
	    
	    String str = e.getMessage();
	    System.out.println(str);
	    if (str.equals("/by zero"))
		System.out.println("0으로 나눌 수 없습니다.");
	}
	catch(InputMismatchException e) {
	    System.out.println(e.getMessage());
	    //e.printStackTrace();
	}
    }

}
