import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exam10_BufferedWriter {

    public static void main(String[] args) {
	
	String str1 = "동해물과 백두산이 마르고 닳도록";
	String str2 = "하느님이 보우하사 우리나라 만세.";
	
	try (BufferedWriter bw =
		new BufferedWriter(new FileWriter("text2.txt"))) {
	    
	    bw.write(str1, 0 , str1.length());
	    bw.newLine();
	    bw.write(str2, 0, str2.length());
	}
	catch(IOException e) {
	    
	    e.printStackTrace();
	}

    }

}
