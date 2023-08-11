package streamEx;
import java.io.*;
import java.util.*;
public class BufferedReaderEx {

    public static void main(String[] args) {
	//1 byte 처리스트림 
	InputStream is = System.in;
	//2 byte 처리스트림
	InputStreamReader isr = new InputStreamReader(is); 
	//좀 더 기능이 향상된 Reader
	BufferedReader br = new BufferedReader(isr);  //문자열 처리 가능
	
	try {
		System.out.println("문자열 한줄 입력 :");
		//문자열 한 줄 입력받기 
		String line = br.readLine();
		System.out.println("입력한 문자열:" + line);
	} catch(IOException e) {
	    e.printStackTrace();
	}
		

    }

}
