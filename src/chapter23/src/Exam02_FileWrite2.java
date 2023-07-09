import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam02_FileWrite2 {

    public static void main(String[] args) {
	OutputStream out = null;
	
	try {
	    
	    out = new FileOutputStream("data.txt");
	    out.write(65);  //ASCII 코드 65 'A'
	    //out.close();
	}
	catch (IOException e) {
	    
	}
	finally {
	    
	    if (out != null) {
		
		try {
		    out.close();
		}
		catch (IOException e2) {
		    
		}
	    }
	}

    }

}
