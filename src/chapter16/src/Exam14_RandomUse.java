import java.util.Random;

public class Exam14_RandomUse {

    public static void main(String[] args) {
	// 매번 다른 수가 나옴
	Random rand1 = new Random();
	
	for(int i = 0; i < 10; i++)
	    System.out.print(rand1.nextInt(10)+ " ");
	System.out.println();
	
	// 매번 같은 순으로 값이 나옴 
	Random rand2 = new Random(12);
	for (int i = 0; i<10; i++)
	    System.out.print(rand2.nextInt(10)+ " ");
	System.out.println();

    }

}
