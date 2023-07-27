import java.util.Arrays;

class MyInt {
   final int num;
    
    MyInt(int num) {
	this.num = num * 100;
    }
    @Override
    public String toString() {    // 참조 타입은 반드시 일일히 스트링 메서드를 넣어주어야 한다. 
	return Integer.toString(num);
    }
}

public class Main2 {

    public static void main(String[] args) {
	
	Object[] arr = new Object[5];
	arr[0] = new MyInt(1);
	arr[1] = new MyInt(2);
	arr[2] = new MyInt(3);
	arr[3] = new MyInt(4);
	arr[4] = new MyInt(5);
	
	Integer[] arr2 = new Integer[5];
	arr2[0] = new Integer(1);
	arr2[1] = new Integer(2);
	arr2[2] = new Integer(3);
	arr2[3] = new Integer(4);
	arr2[4] = new Integer(5);
	
	
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(arr2));
    }

}
