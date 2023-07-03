public class Exam12_AutoBoxingUnboxing2 {

    public static void main(String[] args) {
	
	Integer num = 10;  //오토 박싱 
	num++;      //integer.valueOf(num.intValue()+1);
		   // <--  오토 박싱과 오토 언박싱 동시에 진행
	System.out.println(num);
	
	num +=3;   // Integer.valueOf(num.intValue()+3);
	System.out.println(num);
	
	int r = num + 5;    //오토 언박싱 진행 
	Integer rObj = num -5;   // 오토 언박싱 진행 + 오토 박싱 진행
	
	System.out.println(r);
	System.out.println(rObj);

    }

}
