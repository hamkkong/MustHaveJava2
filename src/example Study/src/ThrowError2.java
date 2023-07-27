
public class ThrowError2 {

    public static void main(String[] args) {
	
	Test test = new Test();
	
	try {
	    test.test("1","ㅁ");  // 숫자를 넘겨주어야 하지만 숫자와 문자를 넘겨준다.
	}
	catch(NumberFormatException e){
		System.out.println("입력하신 값은 숫자가 아닙니다."); // NumerFormatException 	발생 
	}

    }

}

class Test {
    
    public void test(String a, String b ) throws NumberFormatException{
	try {
	int sum = Integer.parseInt(a) + Integer.parseInt(b); // 문자로 받은 a와 b를 숫자로 변환하여 더함
	// 그러나 형변환 과정에서 NumberFormatException이 발생한다.
	System.out.println("문자로 입력받은 " + a + "," + b + "의 합은 " + sum + "입니다.");
	//문자로 받은 숫자 2개의 합을 출력한다. 
    } catch (NumberFormatException e){
	System.out.println("숫자형 문자가 아닙니다. 형변환을 할 수가 없습니다.");  // 어떤 문제가 발생했는지
	throw e;                                                       // 정확히 알릴 수 있게 됨 
    }
	
    }
}