package arrayExam;

public class Ex04 {

    public static void main(String[] args) {
	int arr[] = new int[20];
	int j = 0;  //인덱스 j를 생성 및 초기화하여 20에 해당하는 루프를 새로 생성 
	for (int i=99; i>=arr.length; i-=2) { //for 루프를 사용하여 역순으로 홀수값을 할당하고 출력 
	    				      //i는 99부터 시작하여 2씩 감소(홀수화)
	    
	    if(j==20) break; //j가 20이 되면 루프 종료 
	    arr[j] = i;  //j가 시작되면 i 는 2씩 감소한다. 
	    
	    System.out.print(arr[j]+" ");
	    j++;  //j 루프를 실행
	}
	System.out.println(); //결과 출력

    }

}
