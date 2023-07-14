public class Exam03_UtilMethod {

    public static void main(String[] args) {
	
	MyCalculator calc1 = new MyCalculator();   // 객체 생성 후 사용하는 버전
	int num1 = calc1.adder(1, 2);  //MyCalculator 클래스의  계산식을 읽어옴 
	System.out.println(num1);  
	
	int num2 = MyCalculator.adder(2, 3); // 겍체 생성 안하고 클래스에서 직접 호출함 
	System.out.println(num2);

    }

}
