import java.util.StringTokenizer;
public class UseDelim5 {

    public static void main(String[] args) {
	String str = "KOREA+USA+CANADA+RUSSIA+CHINA";
	System.out.println("str에 담긴 값은 : " + str);
	StringTokenizer tokenizer = new StringTokenizer(str,"+",false);
	
	System.out.println("=== String Tokenizer Start ===");
	while (tokenizer.hasMoreTokens()) {
	    System.out.println("Token Count = " + tokenizer.countTokens());
	    System.out.println(tokenizer.nextToken());
	}
	System.out.println("Token Count = " + tokenizer.countTokens());
	

    }

}
