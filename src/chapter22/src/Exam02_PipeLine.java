import java.util.Arrays;

public class Exam02_PipeLine {

    public static void main(String[] args) {
	
	int[] arr = {1, 2, 3, 4, 5};
	
	//Pipeline 구성 
	int sum = Arrays.stream(arr)
			.filter(n -> n%2 == 1)
			.sum();
	
	System.out.println(sum);

    }

}
