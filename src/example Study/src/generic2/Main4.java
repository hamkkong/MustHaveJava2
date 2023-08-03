package generic2;


class ClassName4<E> {
    


	private E element; // 제네릭 타입 변수 

	void set(E element) {
	    this.element = element;
	}
	
	E get() {
	    return element;
	}
	
	//아래 메서드의 E타입은 제네릭 클래스의 E타입과 다른 독립적인 타입이다.
	
	static <E> E genericMethod3(E o) {  // 제네릭 메서드
	    
	    return o;
	}

	static <T> T genericMethod4(T o) {  // 제네릭 메서드
	    
	    return o;
	}
	
}
public class Main4 {

    public static void main(String[] args) {
	
	ClassName4<String> a = new ClassName4<String>();
	ClassName4<Integer> b = new ClassName4<Integer>();
	
	a.set("10");
	b.set(10);
	
	System.out.println("a data" + a.get());
	// 반환된 변수의 타입 출력 
	System.out.println("a E Type" + a.get().getClass().getName());
	
	System.out.println();
	System.out.println("b data" + b.get());
	// 반환된 변수의 타입 출력 
	System.out.println("b E Type" + b.get().getClass().getName());

	//제네릭 메서드 1 Integer
	System.out.println("\n<E> returnType : " + ClassName4.genericMethod3(3).getClass().getName());
	
	//제네릭 메서드 1 String
	System.out.println("<E> returnType : " + ClassName4.genericMethod3("ABCD").getClass().getName());
	
	//제네릭 메서드 2 ClassName a
	System.out.println("<T> returnType : " + ClassName4.genericMethod4(a).getClass().getName());
	
	//제네릭 메서드 2 Double
	System.out.println("<T> returnType : " + ClassName4.genericMethod4(3.0).getClass().getName());
	
    }

}
