package streamEx;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;  // 전부 java.io.*; 로 퉁쳐도 된다. 

public class OutputStreamWriterEx {

    public static void main(String[] args) {
	//System 클래스의 out이라는 static 필드에는 콘솔창에 출력할 수 있는 
	//PrintStream 객체의 참조값이 들어 있다.
	PrintStream ps=System.out;
	//학습을 위해서 printStream 객체를 부모 type OutputStream으로 받아보기
	//OutputStream도 1byte 처리 스트림이다. 
	OutputStream os = ps;
	//2byte 처리 스트림 
	OutputStreamWriter osw = new OutputStreamWriter(os); //OutputStreamWriter는 2byte 이상 아스키 코드 출력가능 
	
	try {
	    osw.write(44032);  // 가 (아스키코드)
	    osw.write("오잉???");
	    osw.flush();
	} catch (IOException e) {
	    e.printStackTrace();
	}

    }

}
