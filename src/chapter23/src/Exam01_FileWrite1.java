import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam01_FileWrite1 {

    public static void main(String[] args)throws IOException {
	OutputStream out = new FileOutputStream("data.txt");
	out.write(65);  //ASCII 코드 65 ='A'
	out.close(); 

    }

}
