import java.util.Scanner;

public class BubbleSort {
   public static void getNumber(int[] num) {
       Scanner sc = new Scanner(System.in); //  스캐너 객체 생성 
       System.out.println("10개의 정수를 무작위로 입력하세요.");
       
       for (int i=0; i<num.length; i++) {  // 입력받은 정수의 길이만큼 출력 
	   
	   num[i] = sc.nextInt(); // 정수 입력받기 
       }
   }
   
    // 버블 정렬 코드 
    public static void bubbleSort(int[]num) {
	
	for (int i = 0; i<num.length; i++) { // 바깥의 for문을 입력된 숫자대로 반복 
	  
	    for (int j= 0; j< num.length-i-1; j++) { // 단계별로 반복 횟수를 한 번씩 줄어들게 설정 
	      
	       if (num[j] > num[j+1]) {  // 비교하는 배열의 두 값 중 앞 쪽의 숫자가 크면 임시 변수를 이용해 값을 서로 바꿈
		   
		   int tmp = num[j];
		   num[j] = num[j+1];
		   num[j+1] = tmp;
	       }
	   }
	}
    }

    
    public static void main(String[] args) {
	int[]num = new int[10];
	
	getNumber(num);
	
	bubbleSort(num);
	
	// 입력 확인용 출력  (입력받은 숫자를 그대로 출력하면 성공)
	for (int i=0; i<num.length; i++) {
	    
	    System.out.print(num[i] + " ");
	}
	System.out.println();

    }

}
