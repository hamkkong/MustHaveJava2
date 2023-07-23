package arrayCopy;
import java.util.Arrays;
public class Ex01_Clone {

    public static void main(String[] args) {
	int [] a = {1, 2, 3, 4}; //배열 초기화 
	int [] b = a.clone();  // 얕은 복사본 만들기 
	 b[0] =999;
	
	System.out.println("배열 A의값 : " + Arrays.toString(a));  //배열의 내용을 a에 인쇄 
	System.out.println("배열 B의값 : " + Arrays.toString(b));  //배열의 내용을 b에 인쇄 

    }

}
