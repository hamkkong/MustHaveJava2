import java.util.Arrays;
import java.util.stream.IntStream;

public class Exam01_Stream1 {

    public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4, 5};
	
	//스트림 생성 
	IntStream stm1 = Arrays.stream(arr);
	
	//중간 연산 
	IntStream stm2 = stm1.filter(n -> n%2 == 1);
	
	// 최종 연산
	int sum = stm2.sum();
	
	System.out.println(sum);

    }

}
