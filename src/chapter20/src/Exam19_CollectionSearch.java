import java.util.ArrayList ;
import java.util.Collections;
import java.util.List;

public class Exam19_CollectionSearch {

    public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("홍길동");
	list.add("전우치");
	list.add("손오공");
	
	//정렬 
	Collections.sort(list);
	//탐색 
	int idx1 = Collections.binarySearch(list,"홍길동");
	System.out.println(idx1);
	
	int idx2 = Collections.binarySearch(list, "멀린");
	System.out.println(idx2);

    }

}
