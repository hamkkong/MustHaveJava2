package genericEX;

//제네릭 클래스 
class ClassName2 <K,V>{
    private K first;  // K 타입(제네릭)
    private V second; // V 타입(제네릭)
    
    void set(K first, V second) {
	this.first = first;
	this.second = second;
    }
    
    K getfirst() {
	return first;
    }
    
    V getsecond() {
	return second;
    }
}

//메인 클래스
public class Main2 {

    public static void main(String[] args) {
	ClassName2<String, Integer> a = new ClassName2<String, Integer>();
	
	a.set("10", 10);
	
	System.out.println("first data : " + a.getfirst());
	//반환된 변수의 타입 출력
	System.out.println("K type : " + a.getfirst().getClass().getName());
	
	System.out.println("second data : " + a.getsecond());
	//반환된 변수의 타입 출력 
	System.out.println("V Type : " + a.getsecond().getClass().getName());
    }

}
