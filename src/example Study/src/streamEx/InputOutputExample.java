package streamEx;

import java.io.*;

public class InputOutputExample {

    public static void main(String[] args)throws IOException {
     try {	
	InputStream in = System.in;
	InputStreamReader reader = new InputStreamReader(in);
	
	OutputStream out = System.out;
	OutputStreamWriter writer = new OutputStreamWriter(out);
	
	char cdata[] = new char[2];
	int byteRead = reader.read(cdata);
	
	if (byteRead > 0) {
	    	
	int IcData = cdata[0] - '0';  // char 형 변수를 int형 변수로 변환할 때 사용 
	
	writer.write("입력받은 값 :");
	writer.write(cdata);
	writer.write("\n");
	writer.write("입력받은 첫번째 값 + 10 :");
	writer.write(Integer.toString(IcData + 10)); //int 형 변수를 String으로 변환 
	writer.write("\n");
	
	
	System.out.println("######### 결과 #########");
	
	}
	writer.flush();
	writer.close();  // close()내부에서 자동으로 flush()호출됨 
	
	}catch(IOException e) {
	    e.printStackTrace();
	}
    }

}
