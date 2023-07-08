import java.util.stream.IntStream;

public class Exam06_PreTerminal {

    public static void main(String[] args) {
	
	// 합 
	int sum = IntStream.of(1, 3, 5, 7, 9)
			   .sum();
	System.out.println("sum = " + sum);
	
	//개수
	long cnt = IntStream.of(1, 3, 5, 7, 9)
		            .count();
	System.out.println("count = " + cnt );
	
	//평균 
	IntStream.of(1, 3, 5, 7, 9)
		 .average()
		 .ifPresent(avg -> System.out.println("avg = " + avg));
	
	// 최소
	IntStream.of(1, 3, 5, 7, 9)
		 .min()
		 .ifPresent(min -> System.out.println("min = " + min));
	
	//최대 
	IntStream.of(1, 3, 5, 7, 9)
		 .max()
		 .ifPresent(max -> System.out.println("max = " + max));

    }

}
