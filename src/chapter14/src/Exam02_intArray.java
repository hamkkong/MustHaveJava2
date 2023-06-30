public class Exam02_intArray {

    public static void main(String[] args) {
	
	// 길이가 3인 int형 1차원 배열의 생성
	int[] ar = new int[3];
	
	ar[0] = 100; // 값의 저장 : 첫 번째 요소 
	ar[1] = 90;  // 값의 저장 : 두 번째 요소 
	ar[2] = 80;  // 값의 저장 : 세 번째 요소 
	
	int sum = ar[0] + ar[1] + ar[2]; // 값의 참조 
	System.out.println("총점 : " + sum);

    }

}
