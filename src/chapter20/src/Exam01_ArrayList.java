import java.util.ArrayList;
import java.util.List;

public class Exam01_ArrayList {

    public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	
	//객체 저장 : 순서 있음. 중복 허용
	list.add("orange");  // 0
	list.add("apple");   // 1
	list.add("apple");   // 2
	list.add("banana");  // 3
	
	//객체 참조
	for(int i = 0; i < list.size(); i++)
	    System.out.print(list.get(i)+ '\t');
	System.out.println();
	
	//첫 번째 객체 삭제 (Orange)
	list.remove(0);
	
	
	//삭제 후 객체 참조 
	for(int i = 0; i<list.size(); i++)
	    System.out.print(list.get(i)+'\t');
	System.out.println();
	

    }

}
