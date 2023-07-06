import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Exam03_IteratorUse {
    
    public static void main(String[] args) {
	
	List<String> list  = new LinkedList<>();
	
	//객체 저장 : 순서 있음, 중복 허용
	list.add("orange");
	list.add("apple");
	list.add("apple");
	list.add("banana");
	
	// 향상된 기능의 for 문으로 객체 참조 
	
	for(String s: list)
	    System.out.print(s + '\t');
	System.out.println();
	
	//반복자 획득
	Iterator<String> itr = list.iterator();
	
	//반복자를 이용한 순차적 참조 
	String str;
	while(itr.hasNext()) {
	    
	    str = itr.next();
	    System.out.print(str + '\t');
	    
	    if(str.equals("orange"))
		itr.remove();
	}
	System.out.println();
	
	// 반복자 다시 획득 
	itr = list.iterator();
	
	// 삭제 후 결과 확인 
	while(itr.hasNext())
	    System.out.print(itr.next()+'\t');
	
	System.out.println();
    }

}
