import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.HashSet;

public class CollectionTest {

    public static void main(String[] args) {
	//새 HashSet 생성 및 데이터 추가
	Collection<String> c1 = new HashSet<>();
	c1.add("one");
	c1.add("two"); //현재 HashSet은 여기까지 배열을 쌓았다. 
	
	// 두 개의 각각 다른 값을 지닌 리스트를 생성(추가용)
	Collection<String> c2 = Arrays.asList("three", "four");
	Collection<String> c3 = Collections.singleton("five"); // 하나의 객체만 담는 코드 
	
	// c1에 c2, c3의 모든 배열을 추가 (클래스 대 클래스로서 추가)
	c1.addAll(c2); // c1에 c2를 추가 
	c1.addAll(c3); // c1에 c3을 추가
	
	// 현재 컬렉션의 사이즈를 확인
	System.out.println("Size of c1 :" + c1.size());
	
	// 컬렉션을 배열로 변환 
	Object[] converted1 = c1.toArray();
	Object[] converted2 = c1.toArray(new String[c1.size()]);
	
	// 배열의 반복을 사용해 모든 데이터를 출력 
	for (String s : c1) {
	    System.out.println(s);
	}
	
	// 컬렉션에서 배열로 변환한 모든 데이터에 접근한 뒤 출력
	for (int i = 0; i< converted2.length; i++) {
	    System.out.println(converted2[i]);
	}
	
	// 컬렉션에서 반복자를 사용해 데이터에 접근함 
	Iterator iter = c1.iterator();
	while(iter.hasNext()) {
	    System.out.println(iter.next());
	}
	
	// 컬렉션 내에 위치한 모든 원소를 각각의 코드들을 사용하여 출력함 
	c1.forEach(System.out::println);
    }

}
