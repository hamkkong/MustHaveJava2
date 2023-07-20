import java.util.StringTokenizer;
public class UseDelim4 {

    public static void main(String[] args) {
	String str = "A-B-C-D+E*F";
	System.out.println("str에 담긴 값은 : "+ str);
	StringTokenizer tokenizer = new StringTokenizer(str,"-",false);
	
	System.out.println("=== String Tokenizer Start ===");
	while (tokenizer.hasMoreTokens()) {
	    System.out.println(tokenizer.nextToken());
	}

    }

}
