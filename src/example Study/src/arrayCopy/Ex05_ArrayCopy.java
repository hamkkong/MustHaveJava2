package arrayCopy;
import java.util.Arrays;
public class Ex05_ArrayCopy {

    public static void main(String[] args) {
	int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
	int b[][] = new int [a.length][a[0].length];
	
	for(int i=0; i<b.length; i++) {
	    System.arraycopy(a[i],0,b[i],0,a[0].length);
	    
	    System.out.println(Arrays.toString(b[i]));
	}

    }

}
