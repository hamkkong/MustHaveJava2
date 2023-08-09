package innerEx2;

class Calculator {
    private int num1;
    private int num2;
    
    public Calculator(int num1, int num2) {
	this.num1 = num1;
	this.num2 = num2;
    }
    
    public int calculate(Operate operate) {
	return operate.operate(num1, num2);
    }
}

public class RamdaA {

    public static void main(String[] args) {
	// 계산할 두 수
	int num1 = 20;
	int num2 = 10;
	
	//Calculator 클래스 생성하며 계산할 수를 클래스 필드에 저장 
	Calculator calculator = new Calculator(num1 , num2);
	
	//operate() 추상 메서드를 더하기 연산이 되도록 재정한 익명 구현 객체
	Operate operate = (a, b) -> a + b ;
	
	//calculator.calculate()메서드에 람다식을 넣음
	int result = calculator.calculate(operate);
	System.out.println(result);
	
	// 아니면 람다식 자체를 메서드 인자로 바로 넘겨줄 수도 있다 
	int result2 = calculator.calculate((a ,b) -> {
	    return a - b;
	});
	
	System.out.println(result2); // 10

    }

}
