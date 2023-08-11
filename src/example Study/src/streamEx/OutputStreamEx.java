package streamEx;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream; // PrintStream 은 OutputStream의 자식이다. .write()를 통해 문자열을 출력 

public class OutputStreamEx {

    public static void main(String[] args) {
	// System 클래스의 out 이라는 static 필드에는 콘솔창에 출력할 수 있는 
	//PrintStream 객체의 참조값이 들어 있다.
	PrintStream ps = System.out;
	//학습을 위해서 PrintStream 객체를 부모 type OutputStream으로 받아보기
	//OutputStream도 1byte 처리 스트림이다. 
	OutputStream os = ps;
	
	try {
	    //출력은 .flush()까지 호출해야 출력이 된다.
	    os.write(97);
	    os.write(98);
	    os.write(99);
	    
	    //한글 '가'의 unicode 값이44032인데 한글이 출력이 될까?
	    // os.write(44032); OutpitStream 은 한글출력 불가 
	    os.flush(); //방출하기 
	    	
	} catch(IOException e) {
	    e.printStackTrace();
	}

    }

}
