import java.util.StringTokenizer;
public class UseDelim3 {

    public static void main(String[] args) {
	String str = "A-b-c-d-E*F";
	System.out.println("str에 담긴 값은 :" + str);
	StringTokenizer tokenizer = new StringTokenizer(str, "-", true);
	
	System.out.println("===String Tokenizer Start ===");
	while (tokenizer.hasMoreTokens()){
	    
	    System.out.println(tokenizer.nextToken());
	}

    }

}
