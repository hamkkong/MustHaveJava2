import java.util.Arrays;

public class SortInsert {

    public static void insertSort(int[] num) {
	int arr[] = new int[5]; //배열 갯수를 확인하기 위해 객체화한 array 
	
	// 바깥 루프 : 배열의 두 번째 원소부터 마지막 원소까지 반복 
	for(int i = 1; i< num.length;i++) {
	    //현재 인덱스의 값을 key 변수에 저장 
	    int key = num[i];
	    int j = i -1;
	    // 안쪽 루프 : key 값보다 큰 원소들을 오른쪽으로 이동 
	    while(j>=0 && num[j] > key) {
		
		num[j+1] = num[j];
		j--;
	    }
	    //key 값을 적절한 위치에 삽입 
	    num[j + 1] = key;
	}
    }
    // 메인 함수
    public static void main(String[] args) {
	// 정렬할 배열 
	int num[] = {5, 3, 1, 4, 2};	
	System.out.println("Unsorted array : " + Arrays.toString(num));
	
	insertSort(num);
	System.out.println("\n Sorted array : " + Arrays.toString(num));

    } 
    
    

}
