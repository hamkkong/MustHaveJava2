public class Exam05_ArrayInMethod {

    public static void main(String[] args) {
	
	int[] arr = makeIntArray(5); //makeIntArray 메서드를 사용해 길이가 5인 배열을 생성
	int sum = sumOfArray(arr);   //sumOfArray 메서드를 사용해 배열 요소의 합을 계산 
	System.out.println(sum);    //합을 출력

    }

    public static int[] makeIntArray(int len) {
	
	int[] arr = new int[len];  //길이가 len인 배열을 생성하고, 0부터 len -1까지의 값을 배열에 할당하여 반환하는 메서드
	for(int i = 0; i < len; i++) { 
	    
	    arr[i] = i;
	    
	}
	return arr; 
    }
    public static int sumOfArray(int[]arr) {  // 배열의 모든 요소의 합을 계산하여 반환하는 메서드 
	
	int sum = 0;
	for(int i = 0; i<arr.length; i++) { // arr.length = 5,  즉,i의 배열은 1,2,3,4
	    sum = sum +arr[i];  // 1+2+3+4  = 10
	}
	return sum;   // 1~4 까지의 합을 출력함 (반환)
    }
}
