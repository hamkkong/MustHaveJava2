package innerEx;

public class OuterClass {
    // 외부 클래스 객체의 크기를 불리기 위한 배열 변수
    private int[] data;
    
    // static 내부 클래스
    static class InnerClass {
	
    }
    
    // 외부 클래스 생성자
    public OuterClass(int size) {
	data = new int[size];  // 사이즈를 받아 배열 필드의 크기를 늘림
    }
    
    //내부 클래스 객체를 생성하여 반환하는 메서드 
    InnerClass getInnerObject() {
	return new InnerClass();
    }
}
 