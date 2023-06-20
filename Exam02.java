package chapter03;

public class Exam02 {

    public static void main(String[] args) {
	
	short num = 10;
	num += 77L;
	System.out.println(num);   //사람의 강제 형변환 필요하지 않음
	
	num = (short)(num+77L);    // 형변환 필요 
	System.out.println(num);
    }

}
