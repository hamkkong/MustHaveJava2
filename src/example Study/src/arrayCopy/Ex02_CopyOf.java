package arrayCopy;
import java.util.Arrays;

public class Ex02_CopyOf {

    public static void main(String[] args) {
		
	 int [] a = {1, 2, 3, 4};
	 int [] b = Arrays.copyOf(a, a.length);
	
	
	 System.out.println("배열 a : " + Arrays.toString(a));  // 출력구문은 항상 배열 안에 있어야 함
	 System.out.println("배열 b : " + Arrays.toString(b));  // 출력구문은 항상 배열 안에 있어야 함
    }

}
