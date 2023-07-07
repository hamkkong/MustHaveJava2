import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Exam11_ConvertExt {

    public static void main(String[] args) {
	
	List<String> fixedSizeList = Arrays.asList("홍길동","전우치","전우치", "손오공");
	ArrayList<String> list = new ArrayList<>(fixedSizeList);
	
	for(String s : list)
	    System.out.print(s.toString()+ '\t');
	System.out.println();
	
	//중복 제거
	HashSet<String> set = new HashSet<>(list);
	// 다시 list로 변환
	list = new ArrayList<>(set);
	
	for(String s : list)
	    System.out.print(s.toString() + '\t');
	System.out.println();

    }

}
