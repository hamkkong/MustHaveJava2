import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;

public class Exam05_FlieCopy1 {

    public static void main(String[] args) {
	String src = "./src/Exam04_FileRead.java";  //복사하고자 하는 파일의 경로를 넣는다.
	String dst = "FileRead1.txt";  //복사한 파일의 이름을 지어준다.(txt)
	
	try (InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dst)) {
	    
	    Instant start = Instant.now();
	    
	    int data;
	    while(true) {
		
		data = in.read();
		if(data == -1)
		    break;
		out.write(data);
	    }
	    
	    Instant end = Instant.now();
	    System.out.println("복사에 걸린 시간 : " + 
		  Duration.between(start, end).toMillis());
	}
	catch(IOException e) {
	    e.printStackTrace();
	}

    }

}
