
public class Ex_CompareTo {

    public static void main(String[] args) {
	
	String str = new String("abcd");
	System.out.println("원본 문자열 : " + str);
	
	System.out.println(str.compareTo("bcef"));
	System.out.println(str.compareTo("abcd") + "\n");
	
	System.out.println(str.compareTo("Abcd"));
	System.out.println(str.compareToIgnoreCase("Abcd"));
	System.out.println("compareTo()메소드 호출 후 원본 문자열 : " + str);

    }

}
