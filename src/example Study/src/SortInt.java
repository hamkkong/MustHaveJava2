import java.util.Arrays;
import java.util.Scanner;

public class SortInt {  // 10개의 숫자를 입력한 뒤 오름차순으로 배열 정리하는 코드 

    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("숫자를 아무거나 10개 입력하세요.");
	boolean check = false; // boolean 변수 초기화 
	int arr[] = new int[10];  // 배열 
	
	//정수를 입력받아 arr 베열에 저장 
	for (int i = 0; i<10; i++) { // 정수 1개씩 입력받기    
	    check =false; // 각 숫자를 입력할 때마다 check를 false로 초기화 
	   System.out.printf("%d번째 숫자 : ",i+1);
	 try {int num = sc.nextInt();
	 	arr[i] = num;  //숫자가 아닌 경우 예외 처리 
	 	
	   }
	 catch(Exception e) {
	     System.out.println("숫자가 아닌 것을 입력했습니다.");
	     sc.nextLine(); //예외 발생 시 입력 버퍼 비우기 
	     System.out.println("다시 입력해 주세요");
	     i--;  // 예외가 발생했으므로 반복을 다시 수행하기 위해 1을 감소시킴
	     continue;
	 }
	 
	   // 중복된 숫자가 있는지 체크 
	  for(int j = 0; j < i; j++) {
	     if (arr[j] == arr[i]) {
	     check = true;  //입력한 같은 숫자가 있다
	     break; 
	     }
	     
	  }
	     if (check == true) {
	     System.out.println("같은 숫자가 존재합니다. 다시 입력하세요."); 
	     i--;  // 같은 숫자가 있을 경우 i를 감소시켜서 해당 숫자를 다시 입력받도록 함 
	    
	      }
	     
	    
	}

	System.out.println("숫자가 10개 입력되었습니다.");
	
	Arrays.sort(arr);
	for(int i = 0; i<arr.length;i++) {
	    System.out.print("[" + arr[i] + "]");
	}
		
	System.out.println("\n Sorted arr[] : " + Arrays.toString(arr));
    }
   

}
