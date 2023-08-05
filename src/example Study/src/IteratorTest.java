import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;

public class IteratorTest {

    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("A");
	list.add("B");
	list.add("C");

	HashSet<String> set = new HashSet<String>();
	set.add("A");
	set.add("B");
	set.add("C");
	
	HashMap<String, String> map = new HashMap<String, String>();
	map.put("A", "1");
	map.put("B", "2");
	map.put("C", "3");
	
	Iterator<String> iterList = list.iterator();
	Iterator<String> iterSet = set.iterator();
	Iterator<String> iterMap = map.keySet().iterator();
	
	//Iterator에 있는 값 꺼내기
	// while(iterList.hasNext()) {
	// 	   System.out.println(iterList.next());
	// }
	
	System.out.println(iterList.next()); //iterator 다음 값 가져오기 
	iterList.remove();  // next()에 나온 값을 list에서 삭제함 (A 삭제)
	System.out.println("Remove 테스트용");
	
	for(int i = 0; i<list.size(); i++) {  //프레임워크에서는 배열의 길이를 length 대신 size로 표기 
	    	System.out.println(list.get(i)); // A 삭제된 것 확인 가능 
	}
	
    }

}
