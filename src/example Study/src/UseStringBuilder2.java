import java.util.ArrayList;

public class UseStringBuilder2 {

    public static void main(String[] args) {
	StringBuilder stringBuilder = new StringBuilder(); //StringBuilder를 사용할때는 내가 만든 클래스가 아닌
	ArrayList<String> list = new ArrayList<>();        // Java에서 제공하는 java.lang.StringBuilder
	list.add("첫 번째,");                                // 클래스를 사용할 것.
	list.add("두 번째,");
	list.add("세 번째,");
	list.add("네 번째,");
	list.add("다섯 번째");
	
	for (int i = 0; i<list.size(); i++){
	    
	    stringBuilder.append(list.get(i));
	}
	
	System.out.println(stringBuilder);
	

    }

}
