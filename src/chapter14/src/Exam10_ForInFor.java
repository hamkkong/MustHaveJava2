public class Exam10_ForInFor {

    public static void main(String[] args) {
	
	int[][] arr = new int[3][3];
	
	int num = 1;
	
	for(int i=0; i<3; i++) {
	    //먼저 i로 층을 정하고 여기서 j로 각 층의 방을 다 돕니다. 
	    for(int j=0; j<3; j++) {
		arr[i][j] = num;
		num++;
	    }
	}
	
	for (int i=0; i<3; i++) {
	    for (int j=0; j<3; j++) {
		System.out.print(arr[i][j] + "\t");
	    }
	    System.out.println();
	}

    }

}
