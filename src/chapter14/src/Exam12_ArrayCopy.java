import java.util.Arrays;

public class Exam12_ArrayCopy {

    public static void main(String[] args) {
	
	int[] arr1 = new int[10];
	int[] arr2 = new int[8];
	
	//배열 arr1을 3으로 초기화
	Arrays.fill(arr1,3);
	
	// 배열 arr1을 arr2로 부분 복사
	System.arraycopy(arr1, 0, arr2, 3, 4);
	
	//arr1 출력
	for (int i=0; i<arr1.length; i++)
	    System.out.print(arr1[i]+ " ");
	System.out.println();
	
	//arr2 출력 
	for(int i=0; i<arr2.length; i++)
	   System.out.print(arr2[i] + " ");
	System.out.println();

	//배열 arr2를 arr3로 부분 복사
	int[] arr3 = Arrays.copyOfRange(arr2, 2, 5);
	
	// arr3 출력
	for(int i=0; i<arr3.length; i++)
	    System.out.print(arr3[i] + " ");
	System.out.println();
    }

}
