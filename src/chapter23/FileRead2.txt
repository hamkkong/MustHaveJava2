import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Exam04_FileRead {

    public static void main(String[] args) {
	try (InputStream in = new FileInputStream("data.txt")) {
	    
	     int dat = in.read();
	     System.out.println(dat);
	     System.out.printf("%c \n", dat);
	}
	catch(IOException e) {
	    
	    e.printStackTrace();
	}

    }

}
