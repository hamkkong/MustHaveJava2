import java.util.StringTokenizer;
public class UseDelim2 {

    public static void main(String[] args) {
	String str = " name : hamkkong" +
		     " + fruit : apple " + 
		     " + animal : pig ";
	System.out.println("str에 담긴 값은 : " + str);
	
	StringTokenizer tokenizer = new StringTokenizer(str, "+");
	
	System.out.println("=== String Tokenizer Start ===");
	while (tokenizer.hasMoreTokens()) {
	    System.out.println(tokenizer.nextToken());
	}

    }

}
