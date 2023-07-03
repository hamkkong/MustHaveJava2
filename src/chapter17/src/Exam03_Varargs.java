public class Exam03_Varargs {
    
    public static void helloEverybody(String...vargs) { // 가변 인수 표시 
	
	for (String s : vargs) // 가변 인수 사용 
	    System.out.print(s +'\t');
	System.out.println();
    }

    public static void main(String[] args) {
	
	helloEverybody("홍길동");
	helloEverybody("홍길동", "전우치");
	helloEverybody("홍길동", "전우치", "손오공");

    }

}
