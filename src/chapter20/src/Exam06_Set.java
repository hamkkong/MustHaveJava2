import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Set;

public class Exam06_Set {

    public static void main(String[] args) {
	
	Set<String> set = new HashSet<>();
	set.add("orange");
	set.add("apple");
	set.add("banana");
	set.add("apple");
	
	System.out.println("객체 수 : " + set.size());
	
	//반복자를 이용한 전체 출력 
	for(Iterator<String> itr = set.iterator(); itr.hasNext();)
	    System.out.print(itr.next() + '\t');
	System.out.println();
	
	//향상된 기능의 for문을 이용한 전체 출력 
	for(String s : set)
	    System.out.print(s+'\t');
	System.out.println();
    }

}
