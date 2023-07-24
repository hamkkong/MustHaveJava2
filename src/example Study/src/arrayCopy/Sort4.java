package arrayCopy;
import java.util.Arrays;
import java.util.Collections;
public class Sort4 {

    public static void main(String[] args) {
	Integer[]array = {58, 32, 64, 12, 15, 99};
	
	Arrays.sort(array, 1, 4, Collections.reverseOrder());  //  배열변수 array, 시작 1, 종료 4 
		for (int i = 0 ; i < array.length; i++) {
		    
		    System.out.print("[" + array[i] + "]"); //32,64,12만 내림차순으로 정렬
		}
		System.out.println("\n Sort array[] : " + Arrays.toString(array));

    }

}
