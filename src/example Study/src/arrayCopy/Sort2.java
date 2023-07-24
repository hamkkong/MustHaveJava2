package arrayCopy;
import java.util. Arrays;
import java.util.Collections;
import java.util.Comparator;
public class Sort2 {

    public static void main(String[] args) {
	Integer[]array = {58, 32, 64, 12, 15, 99}; // 내림차식은 int 안됨; 반드시 Integer
	
	//Arrays.sort(array, Collections.reverseOrder());
	
	//	for(int i = 0; i < array.length; i++) {
		    
	//	    System.out.print("[" + array[i] + "]");
	
	
	//Arrays.sort(array, new Comparator<Integer>(){   //Comparator 메서드 사용
	 //   @Override
	  //  public int compare(Integer i1, Integer i2) {
	  //	return i2 - i1;
	  //  }
	    
	//	});
	
	
	Arrays.sort(array,(i1, i2) -> i2 - i1);  // 람다식
		System.out.println("\n Sort array[] : " + Arrays.toString(array));
    }

}
