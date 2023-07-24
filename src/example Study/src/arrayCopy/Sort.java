package arrayCopy;
import java.util.Arrays;

public class Sort {
    public static void main(String[] arges) {
	
	int[]array = {58, 32, 64, 12, 15, 99}; //array = arr 로 축약 가능 
	
	Arrays.sort(array);   // 라이브러리가 있어야 작동함 (작성하고 x 뜨면 라이브러리 확인 )
	
	for(int i = 0; i< array.length; i++) {
	    
	    System.out.print("[" + array[i] + "]");
	    
	}
	System.out.println("\n Sorted arr[] : "+ Arrays.toString(array));
    }

}
