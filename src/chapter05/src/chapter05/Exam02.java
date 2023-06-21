package chapter05;

public class Exam02 {

    public static void main(String[] args) {
	
	int n =4;

	    switch(n % 3) //조건식
	    {
	    case 1 :
		System.out.println("나머지가 1");
	       break;
	       
	    case 2 :
		System.out.println("나머지가 2");
		break;
		
	    default:
		System.out.println("나머지가 0");
	    
	    }

    }

}
