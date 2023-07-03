import java.util.Arrays;

class INum2 {
    private int num;
    
    public INum2(int num) {
	this.num = num;
    }
    @Override
    public boolean equals(Object obj) {
	if (this.num == ((INum2)obj).num)
	    return true;
	else
	    return false;
    }
}

public class Exam16_ArrayObjeEquals2 {

    public static void main(String[] args) {
	INum2[] arr1 = new INum2[2];
	INum2[] arr2 = new INum2[2];
	
	arr1[0] = new INum2(1);
	arr2[0] = new INum2(1);
	
	arr1[1] = new INum2(2);
	arr2[1] = new INum2(2);
	

	System.out.println(Arrays.equals(arr1, arr2));
    }

}
