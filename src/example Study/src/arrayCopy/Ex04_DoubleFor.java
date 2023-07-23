package arrayCopy;

import java.util.Arrays;

public class Ex04_DoubleFor {

    public static void main(String[] args) {
	
	int a[][] = { {1,2,3},{4,5,6,},{7,8,9}};
	int [][]b = new int [a.length][a[0].length];
	
	for (int i=0; i<a.length;i++) {
	    for(int j=0; j<a[i].length; j++) {
		b[i][j] = a[i][j];
		
		// System.out.println(Arrays.toString(b[i])); // 여기에 쓰면 배열의 내용을 여러번 인쇄하게 됨 
	    }
	   
	    System.out.println(Arrays.toString(b[i])); //복사된 전체 배열을 한번에 표시하는 경우 
	 } 
	
    }

}
