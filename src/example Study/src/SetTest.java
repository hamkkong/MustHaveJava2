import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {
	//새로운 Set 생성
	Set<String> s1 = new HashSet<>();
	Set<String> s2 = Set.of("three", "four");
	
	// Set에 자료 추가
	s1.addAll(Arrays.asList("one", "two"));
	s1.addAll(s2);
	s1.add("five");
	s1.add("two");
	s1.remove("five");
	
	System.out.println("## element in Set");
	System.out.println(s1);
	
	//스트림 api를 이용해 배열을 출력
	s1.stream().forEach(System.out::println);
	
	System.out.println("## check exist element in Set");
	System.out.println(s1.contains("one"));
	
	// 새로운 HashSet을 만든 뒤 배열을 추가
	Set<String> lset = new LinkedHashSet<>();
	lset.addAll(Arrays.asList("one","two", "three", "four"));
	lset.add("five");
	
	System.out.println("\n## element in LinkedHashset");
	System.out.println(lset);
	
	//LinkedHashSet에서 반복자 가져오기
	System.out.println("## print element using Iterator");
	Iterator<String> iter = lset.iterator();
	while (iter.hasNext()) {
	    System.out.println(iter.next());
	}
	
	// 새로운 TreeSet 만든뒤 배열을 추가
	Set<Integer> tset = new TreeSet<>();
	tset.addAll(Arrays.asList(50,10,60,20));
	
	System.out.println("\n## elements in TreeSet");
	System.out.println(tset);
	
	// 스트림 api를 사용해 내림차순 만들기
	System.out.println("## Desceding sort with stream api");
	tset.stream().sorted((o1, o2) -> o2.toString().compareTo(o1.toString())).forEach(System.out::println);
	
    }

}
