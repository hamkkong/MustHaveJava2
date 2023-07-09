import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam09_TextRead {

    public static void main(String[] args) {
	try (Reader in = new FileReader("text.txt")) {
	    
	    int ch;
	    
	    while(true) {
		
		ch = in.read();
		if (ch == -1)
		    break;
		System.out.print((char)ch);
	    }
	}
	catch(IOException e) {
	    
	    e.printStackTrace();
	}

    }

}
