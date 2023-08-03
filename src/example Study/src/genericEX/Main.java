package genericEX;

class ClassName<E> {
    
    private E element;   // 제네릭 타입 변수
    
    void set(E element) {  // 제네릭 파라미터 메서드 : 세터 
	this.element = element;
    }
    
    E get() {  // 제네릭 타입 반환 메서드 : 게터 
	return element;
    }


   

}

public class Main {

    public static void main(String[] args) {
	ClassName<String> a = new ClassName<String>();
	ClassName<Integer> b = new ClassName<Integer>();
	
	a.set("10");
	b.set(10);
	
	System.out.println("a data : " + a.get());
	//반환된 변수의 타입 출력 
	System.out.println("a E type : " + a.get().getClass().getName());
	
	System.out.println();
	System.out.println("b data : " + b.get());
	//반환된 변수의 타입 출력
	System.out.println("b E type : " + b.get().getClass().getName());

    }

}
