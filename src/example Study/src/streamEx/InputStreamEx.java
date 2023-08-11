package streamEx;
import java.io.*;
public class InputStreamEx {
    public static void main(String[] args) {
    //키보드와 연결된 InputStream type의 참조값을 kbd라는 지역변수에 담기
    //InputStream 객체는 1byte처리 스트림이다.
    //영문자, 대소문자, 숫자, 특수문자만 처리가능 (그리고 1자리 수만 출력가능)
    //한글처리불가 
    InputStream kbd = System.in;
    System.out.print("입력 : ");
    
    try {
    	//입력한 키의 코드값 읽어오기
    	int code = kbd.read();
    	System.out.println(code);
    	//코드값에 대응되는 문자 얻어내기 
    	
    	char ch = (char)code;
    	System.out.println("char : " +ch);
    } catch(IOException e) {
	e.printStackTrace();
    }
    
    System.out.println("main 메서드가 종료됩니다.");
    
    }
}
