import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exam03_CollectionVsStream {

    public static void main(String[] args) {
	int[] arr = {1, 5, 3, 2, 4};
	List<Integer> list = new ArrayList<>();
	
	// 컬렉션 프레임워크를 이용한 방식
	for(int i : arr) { //필터링 
	    
	    if (i%2 == 1) {
		
		list.add(i);
	    }
	}
	Collections.sort(list); //정렬 
	
	for (int i : list) { //요소 추출 
	    
	    System.out.print(i+ "\t");
	}
	
	System.out.println();
	
	//Stream을 이용한 방식
	Arrays.stream(arr)
		.filter(n -> n%2 == 1) //필터링 
		.sorted()              //정렬 
		.forEach(n -> System.out.print(n+"\t"));
	
	System.out.println();

    }

}
