package arrayExam;

public class Ex02 {

    public static void main(String[] args) {
	
	int arr[] = new int[10];
	
	for (int i=0; i<arr.length; i++) {  //배열 초기화 
	    
	   arr[i] = i*2;
	   
	   System.out.print(arr[i] + " "); // 이 출력문은 for문 안에 있어야만 동작함.
	}
	
	   System.out.println(); //전체 출력 

    }

}
