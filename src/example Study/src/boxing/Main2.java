package boxing;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
	ArrayList<Integer> intArrayList = new ArrayList<>();
	
	//오토박싱
	intArrayList.add(10); //배열1[0]
	intArrayList.add(15); //배열2[1]
	intArrayList.add(20); //배열3[2]
	System.out.println("intArrayList : " + intArrayList);
	
	//언박싱
	int num = intArrayList.get(0);
	System.out.println("num :" + num);
    }

}
