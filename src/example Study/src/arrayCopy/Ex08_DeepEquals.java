package arrayCopy;

import java.util.Arrays;

public class Ex08_DeepEquals {

    public static void main(String[] args) {
	int[][] intArray1 = new int[][] {
	    
	    {1,2},
	    {3,4},
	    {5,6}
	};
	
	int[][] intArray2 = new int[][] {
	    
	    {1,2},
	    {3,4},
	    {5,6}
	};
	System.out.println("Arrays.equals() 메서드의 결과 : " + Arrays.equals(intArray1, intArray2));
		// equals() 는 2차원 배열을 이해하지 못하고 메모리 위치만을 참조 : == 연산자가 배열을 이해 못하는 것과 같음 
		// 따라서 1차원 배열을 비교할때만 사용됨 
	System.out.println("Arrays.deepEquals() 메서드의 결과 : " + Arrays.deepEquals(intArray1, intArray2));
		//deepEquals()는 2차원 배열을 이해하는 것이 가능하므로 옳은 결과값을 출력함
    }

}
