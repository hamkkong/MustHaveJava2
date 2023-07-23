package arrayCopy;
import java.util.Arrays;

public class Ex03_copyOfRange {

    public static void main(String[] args) {
	int[] a = {1, 2, 3, 4};
	int[] b = Arrays.copyOfRange(a,1,3);  //복사할 배열의 시작점과 끝점을 정할 수 있음 
					      // (현재는 1에 해당하는 2와 2에 해당하는 3 출력 ;1이상 3미만 )
	System.out.println("배열 a : " + Arrays.toString(a));
	System.out.println("배열 b : " + Arrays.toString(b));

    }

}
