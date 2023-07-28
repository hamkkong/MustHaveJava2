package boxing;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	ArrayList<Integer> intArrayList = new ArrayList<>();
	
	//오토박싱 
	intArrayList.add(10);
	intArrayList.add(15);
	intArrayList.add(20);
	
	System.out.println("intArrayList : " + intArrayList);

    }

}
