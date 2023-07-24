package arrayCopy;
import java.util.Arrays;
import java.util.Comparator;

public class StringSort {

    public static void main(String[] args) {
	String[] array = {"Apple", "Kiwi", "Banana","Watermelon","Cherry"};
	
//	Arrays.sort(array,new Comparator<String>(){  //문자열의 길이(글자수가 작을수록 왼쪽에 배치함)
//	    @Override
//		public int compare(String s1, String s2) {
		  
//		    return s1.length() - s2.length();
		    
	
//	    }    
	
//	});
	
	Arrays.sort(array,(s1,s2) -> s1.length() - s2.length());  // 람다식
	
	System.out.println("Sorted arr[] : " + Arrays.toString(array));

    }   // 이 식은 문자열을 다루므로 int를 사용하는 출력식은 사용할 수 없음.

}
