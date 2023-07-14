class Cat{
    
    static int a = 5;    //  static 변수 
    int num = 3;
    
    void printValue(int num) {    // 메서드 
	this.num = num;
	System.out.println("num : " + this.num);  // num의 값 호출 (this가 있는 이유는 스태틱 호출x)
	System.out.println("a : " + a);  // a의 값 호출 
    }
    
}
public class Exam01_GlobalVariable {

    public static void main(String[] args) {
	int num1 = 5;
	int num2 = 2;
	System.out.println(num1 + " , " + num2);  // num1 과 num2 를 나란히 보여줌 
	
	Cat cat1 = new Cat();  // 스택 영역에 객체 생성
	cat1.num = 1;   //객체에서 새로 생성한 값 
	cat1.a = 10;    // 객체에서 새로 생성한 a의 값  (스태틱 값과 혼동한다)
	cat1.printValue(20);  //20, 10 (생성된 값을 차례대로 재출력해줌) 
	System.out.println(cat1.num);  // 20
	System.out.println(cat1.a);    // 10
	
	
	Cat cat2 = new Cat();
	cat2.num = 2;
	cat2.a = 11;
	cat2.printValue(10); // 10, 11 (셍성된 값을 차례대로 재출력해줌; 그러나 cat1의 값이 출력되지 않았다!)
	System.out.println(cat2.num); //10
	System.out.println(cat2.a);   //11
	System.out.println(cat1.a);   //11 (a의 값이 11로 통일되어서 cat1의 원래 값이 사라져버림) 
    }   // 스태틱 호출이 되지 않았기 때문에 발생한 문제임!!! 

}
