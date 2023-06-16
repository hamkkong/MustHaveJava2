package replit;

import java.util.Scanner;

public class Exam11
{

	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("숫자를 입력하고 엔터를 치세요.");

	    System.out.print("첫 번째 숫자 :");
	    int num1 = sc.nextInt();

	    System.out.print("두 번째 숫자 :");
	    int num2 = sc. nextInt();

	    int result1 = num1 + num2;
	    System.out.println(num1+"+"+num2+"="+result1);
	    
	    int result2 = num1 - num2;
	    System.out.println(num1+"-"+num2+"="+result2);

	    int result3 = num1*num2;
	    System.out.println(num1+"*"+num2+"="+result3);
	    
	    int result4 = num1/num2;
	    System.out.println(num1+"/"+num2+"="+result4);

	    int result5 = num1%num2;
	    System.out.println(num1+"%"+num2+"="+result5);

	}

}
