package wrapper_ex;

public class Wrapper02 {

    public static void main(String[] args) {
	Integer num =  Integer.valueOf(10); //래퍼 클래스 1  // 정적 팩토리 메서드 사용 
	Integer num2 = Integer.valueOf(10); //래퍼 클래스 2  // valueOf()는 new 를 사용하지 않음.
	
	Integer num3=  Integer.valueOf(333); //래퍼 클래스 1  // 정적 팩토리 메서드 사용 
	Integer num4 = Integer.valueOf(10); //래퍼 클래스 2  // valueOf()는 new 를 사용하지 않음.
	
	int i = 10; // 기본 타입 
	
	System.out.println("래퍼클래스 == 기본타입 : " + (num == i)); // true 
	System.out.println("래퍼클래스.equals(기본타입) : " + (num.equals(i))); // true
	System.out.println("래퍼클래스1 == 래퍼클래스2 : " + (num == num2)); // true 
	System.out.println("래퍼클래스3 == 래퍼클래스4 : " + (num3 == num4)); // false 
	System.out.println("래퍼클래스.equals(기본타입)  : " + (num.equals(num2)));  //true 

    }

}
