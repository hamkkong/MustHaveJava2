package innerEx;

import java.util.ArrayList;

public class Main3 {

    public static void main(String[] args) {
	// innerClass 객체를 저장할 리스트
	ArrayList<Object> al = new ArrayList<>();  //객체 생성
	
	for (int counter = 0; counter < 50; counter++) {
	    // innerClass 객체를 생성하기 위해 OuterClass를 초기화하고 메서를 호출하여 리스트에 넣는다.
	    // 이때 OuterClass 객체는 메서드 호출용으로 일회용으로 사용되고 버려지기 때문에 GC 대상이 되어야 한다.
	    al.add(new OuterClass(100000000).getInnerObject());
	    System.out.println(counter);
	}

    }

}
