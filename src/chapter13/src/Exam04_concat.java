
public class Exam04_concat {

    public static void main(String[] args) {
	
	String str1 = "기초";
	String str2 = "프로그래밍";
	
	String str3 = str1.concat(str2);  // String끼리 합치기 
	System.out.println(str3);
	
	String str4 = "자바".concat(str3); // 문자열 리터럴과 String 합치기 
	System.out.println(str4);
    }

}
