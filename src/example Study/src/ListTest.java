import java.util.*;

public class ListTest {

    public static void main(String[] args) {
	// 새 리스트를 작성
	List<String> l1 = new ArrayList<>();
	List<String> l2 = Arrays.asList("one","two");
	Set<String>  l3 = Set.of("three", "four");

	
	//리스트에 데이터 추가 
	l1.addAll(l2);
	l1.addAll(1,l3);
	l1.add("five");
	
	System.out.println("## element in List");
	System.out.println(l1);
	
	// 새로운 LinkedList 작성 후 데이터 추가
	LinkedList<String> llist = new LinkedList<>();
	llist.addAll(l2);
	llist.addAll(1, l3);
	llist.add("five");
	
	System.out.println("## element in LinkedList");
	System.out.println(l1);
	
	//인덱스값과 데이터에 접근 
	System.out.println("## first element:" + l1.get(0));
	System.out.println("last index of three: " + l1.lastIndexOf("three"));
	
	//리스트 내의 데이터 변환
	l1.set(0, "zero");
	System.out.println("## after set(): element in LinkedList");
	System.out.println(l1);
	
	// 내림차순 정렬 
	Collections.sort(l1);
	System.out.println("Descending sort of l1");
	System.out.println(l1);
	
	//오름차순 정렬
	l1.sort(new Comparator<Object>() {
	    @Override
	    public int compare(Object o1, Object o2) {
		return o2.toString().compareTo(o1.toString());
	    }
	});
	System.out.println("## Ascending sort of l1");
	System.out.println(l1);
	
	// Ascending sort with stream api
	System.out.println("## Ascending sort with stream api");
	l1.stream().sorted((o1, o2) -> o2.toString().compareTo(o1.toString())).forEach(System.out::println);
    }

}
