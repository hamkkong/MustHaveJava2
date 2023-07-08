import java.util.Arrays;
import java.util.List;

public class Exam07_Reduce {

    public static void main(String[] args) {
	List<String> list1 = Arrays.asList("홍길동", "전우치", "손오공");
	
	String name1 = list1.stream()  // 초깃값으로 주어진 글자 길이가 서로 같음 - 초기값이 남음 
		 .reduce("이순신", (s1, s2) ->
		 s1.length() >= s2.length() ? s1 : s2);
	System.out.println(name1);
	
	List<String> list2 = Arrays.asList("홍길동", "멀린", "해리포터"); 
	
	String name2 = list2.stream() // 초깃값 포함하여 가장 긴 글자길이를 가진 데이터가 출력됨
		.reduce("이순신", (s1, s2) ->
		s1.length() >= s2.length() ? s1 : s2);
	System.out.println(name2);

    }

}
