import java.util.Arrays;

public class Exam13_ArrayEquals {

    public static void main(String[] args) {
	
	int[] arr1 = {1, 2, 3, 4, 5};
	int[] arr2 = Arrays.copyOf(arr1, arr1.length);
	
	boolean bCheck = Arrays.equals(arr1, arr2);
	System.out.println(bCheck);
	

    }

}
