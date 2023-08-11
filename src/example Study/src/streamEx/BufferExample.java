package streamEx;

import java.io.BufferedReader;  // 임포트 필수! 
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 

public class BufferExample {

    public static void main(String[] args) throws IOException { // 이거 안할꺼면 try ~ catch 써야함 
	
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	String s = br.readLine();  //Bufferedwriter의 기본형은 String
	
	int i = Integer.parseInt(s) + 10; // String을 int로 형변환하기 위해 parseint, +10 !
	
	br.close(); // Bufferedreader 도 입력을 마쳤으면 닫아준다
	
	bw.write("입력받은 값 : " + s); //출력 
	bw.newLine(); // 개행 메서드 
	bw.write("입력받은 값 + 10 : " + i +"\n"); //이렇게 하면 제대로 출력됨
	
	bw.flush();  //남은 값 출력 && 버퍼 초기화
	bw.close();  // Bufferedwriter 닫기 
   

    }

 }


