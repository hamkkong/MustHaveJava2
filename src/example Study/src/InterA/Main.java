package InterA;


interface IAdd{
    int add(int x, int y);
}



public class Main {
   
    public static void main(String[] args) {
	// 람다 표현식으로 간결하게 표현하기 
	
	IAdd lambda = (x, y) -> {return x + y;}; // 람다식 끝에는 항상 세미콜론이 붙는다! 
	
	
	int result1 = lambda.add(1,2);
	System.out.println(result1);  // 3

    }

}
