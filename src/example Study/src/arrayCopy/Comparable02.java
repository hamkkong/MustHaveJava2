package arrayCopy;
import java.util.*;

class DescendingOrder implements Comparator<Integer> { //지금부터 내림차순을 진행하기 위해 Comparator 사용하겠다 
    
    public int compare(Integer o1, Integer o2) {
	if (o1 instanceof Comparable && o2 instanceof Comparable) {
	    
	    Integer c1 = (Integer)o1;
	    Integer c2 = (Integer)o2;
	    return c2.compareTo(c1);  // o1 = o2 이면 0을 반환, o1>o2 이면 1을 반환, o1<o2이면 -1을 반환 
	}
	return -1;   //o1이 o2보다 작다는 설정을 임의대로 해줌; 내림차순을 만들기 위해서  
    }
    
}

public class Comparable02 {

    public static void main(String[] args) {
	TreeSet<Integer>ts = new TreeSet<Integer>(new DescendingOrder()); // Treeset에 내림차순의 인스턴스를 전달 
	
	ts.add(30);  // 숫자들을 TreeSet에 추가함 
	ts.add(40);
	ts.add(20);
	ts.add(10);
	
	Iterator<Integer> iter = ts.iterator(); // TreeSet의 요소들을 반복하며 출력 
	while(iter.hasNext()) {
	    System.out.println(iter.next());  // TreeSet은 중복 혀용이 안됨; 중복된 값이 들어가지 않음.
	}

    }

}
