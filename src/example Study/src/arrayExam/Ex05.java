package arrayExam;
import java.util.Scanner;
public class Ex05 {

    public static void main(String[] args) {
	int j = 0;
	System.out.print("1차원 배열의 크기 입력 : ");  // 사용자로부터 1차원 배열의 크기 입력받
	
	Scanner sc = new Scanner(System.in);
	int num= sc.nextInt(); 
	sc.nextLine();   //정수 입력 이후에 남은 개행 문자 제거 
	
	String sArr[] = new String[num];   //크기가 num인 문자열 배열 선언 
	String str = "";
	
	for(int i = 0; i<sArr.length; i++) {  //사용자로부터 원소를 입력 받아 배열에 저장함 
	    System.out.println("배열의 " + (i+1) + "번째 원소 입력 : ");
	    str = sc.nextLine();
	    sArr[i] = str;
	}
	while(j <sArr.length) {  // 배열의 모든 원소를 출력
	    System.out.println(sArr[j] + " ");
	    j++;
	}
	// 사용이 끝난 Scanner  객체 닫기 
	sc.close();
    }

}
