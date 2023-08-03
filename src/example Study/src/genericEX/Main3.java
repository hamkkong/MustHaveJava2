package genericEX;
class ClassName3<E> {
    
    private E element; //제네릭 타입 변수
    
    void set(E element) {
	
	this.element = element;
    }
    
    E get() {  // 제네릭 타입 반환 메서드
	return element;
    }
    
    <T> T genericMethod(T o) { // 제네릭 메서드
	return o;
    }
    
    
}
public class Main3 {

    public static void main(String[] args) {
	
	ClassName3<String> a = new ClassName3<String>();
	ClassName3<Integer> b = new ClassName3<Integer>();
	
	a.set("10");
	b.set(10);
	
	System.out.println("a data : " + a.get());
	//반환된 변수의 타입 출력 
	System.out.println("a E Type : " + a.get().getClass().getName());
	
	System.out.println();
	System.out.println("b data : " + b.get());
	//반환된 변수의 타입 출력 
	System.out.println("b E Type : " + b.get().getClass().getName());
	
	//제네릭 메서드 Integer
	System.out.println("\n<T> returnType : " + a.genericMethod(3).getClass().getName());
	
	//제네릭 메서드 String
	System.out.println("<T> returnType : " + a.genericMethod("ABCD").getClass().getName());
	
	//제네릭 메서드 ClassName b
	System.out.println("<T> returnType : " + a.genericMethod(b).getClass().getName());

    }

}
