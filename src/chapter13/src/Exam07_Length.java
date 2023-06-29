
public class Exam07_Length {

    public static void main(String[] args) {
	
	String str = "apple";
	for (int i=0; i<str.length(); i++) {  // 문자열 길이 확인  
	    
	    char ch = str.charAt(i);  //  문자 읽기 
	    if (ch == 'l')
		break;
	    System.out.println(ch);
	}

    }

}
