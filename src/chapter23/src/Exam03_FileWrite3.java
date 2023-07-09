import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam03_FileWrite3 {

    public static void main(String[] args) {
	try (OutputStream out = new FileOutputStream("data.txt")) {
	    
	    out.write(65);  //ASXII 코드 65 = 'A'
	}
	catch(IOException e) {
	    
	    e.printStackTrace();
	}

    }

}
