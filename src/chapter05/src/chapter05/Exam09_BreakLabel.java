package chapter05;

public class Exam09_BreakLabel {

    public static void main(String[] args) {

	int sum = 0;

	myExit: while (true) { // 무한 반복

	    for (int i = 0; i < 100; i++) {

		sum = sum + i;
		if (sum > 2000) {

		    System.out.printf("%d : %d\n", i, sum);
		    break myExit;
		}
	    }
	}

    }

}
