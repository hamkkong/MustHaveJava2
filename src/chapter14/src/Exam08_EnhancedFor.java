public class Exam08_EnhancedFor {

    public static void main(String[] args) {
	
	int[]arr = {1, 2, 3, 4, 5};
	
	// 배열 요소 전체 출력 
	for(int e : arr) {
	    System.out.print(e + " ");
	}
	System.out.println();  // 줄바꿈을 목적으로 
	
	int sum = 0;
	
	// 배열 요소의 전체 합 출력
	for(int e: arr) {
	    sum = sum + e;
	}
	System.out.println("sum: " + sum);
    }

}
