
public class Ex_Trim {

    public static void main(String[] args) {
	String str = new String(" Java  ");
	System.out.println("원본 문자열 : " + str);
	
	System.out.println(str + '|');
	System.out.println(str.trim() + '|');
	System.out.println("trim()메서드 호출 후 원본 문자열 : " + str);

    }

}
