import java.util.Arrays;
import java.util.List;

public class Exam04_sorted {

    public static void main(String[] args) {
	List<String> list = Arrays.asList("홍길동", "멀린", "해리포터");
	
	//사전순 정렬 
	list.stream()
	    .sorted()
	    .forEach(n->System.out.print(n + "\t"));
	
	System.out.println();
	
	//글자 길이순 정렬 
	list.stream()
	    .sorted((s1, s2) -> s1.length() - s2.length())
	    .forEach(n -> System.out.print(n +"\t"));
	
	System.out.println();
    }

}
