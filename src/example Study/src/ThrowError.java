
public class ThrowError {

    public static void main(String[] args) {
	try {
	    throw new Exception(); // 강제로 Exception 객체 생성
	}catch(Exception e) {
	    System.out.println("예외를 강제로 발생했습니다.");
	}

    }

}
