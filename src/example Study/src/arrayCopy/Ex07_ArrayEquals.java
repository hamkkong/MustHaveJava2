package arrayCopy;
import java.util.Arrays;
public class Ex07_ArrayEquals {

    public static void main(String[] args) {
	int[]intArray1 = new int[] {1, 2, 3};
	int[]intArray2 = new int[] {1, 2, 3};
	
	if (Arrays.equals(intArray1, intArray2)) {
	    
	    System.out.println("두 배열은 동일합니다.");
	}
	else {
	    System.out.println("두 배열은 동일하지 않습니다.");
	}
    }

}
