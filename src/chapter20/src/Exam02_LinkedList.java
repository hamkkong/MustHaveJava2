import java.util.LinkedList;
import java.util.List;

public class Exam02_LinkedList {

    public static void main(String[] args) {
	
	List<String> list = new LinkedList<>();
	
	// 객체 저장 : 순서 있음. 중복 허용 
	list.add("Orange");
	list.add("Apple");
	list.add("Apple");
	list.add("Banana");
	
	//객체 참조 
	for(int i = 0; i < list.size(); i++)
	    System.out.print(list.get(i) + '\t');
	System.out.println();
	
	//첫 번째 객체 삭제
	list.remove(0);
	
	//삭제 후 객체 참조 
	for(int i =0; i < list.size(); i++)
	    System.out.print(list.get(i) + '\t');
	System.out.println();

    }

}
