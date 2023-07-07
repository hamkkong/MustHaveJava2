import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exam17_CollectionsSort {

    public static void main(String[] args) {
	List<String> list = Arrays.asList("홍길동", "전우치", "손오공", "멀린");
	list = new ArrayList<>(list);
	
	// 정렬 이전 출력
	System.out.println(list);
	
	// 정렬 
	Collections.sort(list);
	
	//정렬 이후 출력 
	System.out.println(list);

    }

}
