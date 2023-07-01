import java.util.Scanner;
import java.util.InputMismatchException;

public class Exam03_Finally {

    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	try {
	    int num1 = sc.nextInt();
	    int num2 = 10 / num1;
	    System.out.println(num2);
	   
	}
	catch(ArithmeticException e) {
	    
	    String str = e.getMessage();
	    System.out.println(str);
	    if (str.equals("/ by zero"))
		System.out.println("0으로 나눌 수 없습니다.");
	}
	catch(InputMismatchException e) {
	    System.out.println(e.getMessage());
	    //e.printStackTrace();
	}
	finally {
	    System.out.println("Good bye ~~~!");
	}
    }

}
