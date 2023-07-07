import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringDesc implements Comparator<String> {
    
    public int compare(String s1, String s2) {
	
	return s2.compareTo(s1);
    }
}

public class Exam18_CollectionSort2 {

    public static void main(String[] args) {
	java.util.List<String> list = new ArrayList<>();
	list.add("홍길동");
	list.add("전우치");
	list.add("손오공");
	
	// 정렬 : 오름차순 
	Collections.sort(list);
	System.out.println(list);
	
	StringDesc cmp = new StringDesc();
	
	// 정렬 : 내림차순 
	
	Collections.sort(list, cmp);
	System.out.println(list);
	

    }

}
