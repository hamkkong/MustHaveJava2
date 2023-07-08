interface Unit9 {
    
    int calc(int a, int b); //매개변수 둘, 반환형 int
}
 
public class Exam09_LambdaRule2 {

    public static void main(String[] args) {
	Unit9 unit;
	unit = (a,b) -> { return a + b; };
	//unit = a,b ->{ return a + b; };  //앞쪽 소괄호 생략 안 됨 
	//unit = (a,b) -> return a + b;   // 뒤쪽 중괄호 생략 안 됨 
	int num = unit.calc(10,20);
	System.out.println(num);
	
	
	unit = (a,b) -> a * b;
	System.out.println(unit.calc(10, 20));

    }

}
