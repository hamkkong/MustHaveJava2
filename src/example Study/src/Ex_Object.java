class Parent01{ //extends Object이 생략됨. 자바의 모든 클래스는 명시적인 상속을 받지 않으면
    		//최고 조상클래스인 Object로부터 묵시적 상속을 받는다. 
    public void p01() {
	System.out.println("부모클래스 메서드 p01()");
    }
    
}

class Child01 extends Parent01{
    /*클래스 상속형식)
     *class 자손클래스 extends 부모(조상, 슈퍼)클래스 {
     *   실행문장;
     *   }
     */
    public void ch01() {
	System.out.println("자손클래스 메소드 ch01()");
    }
}
public class Ex_Object {

    public static void main(String[] args) {
	Child01 ch = new Child01();
	ch.p01();//상속받아서 호출 
	ch.ch01();
	// 원래 자손클래스 메소드 ch01 밖에 출력을 못하나 상속으로 인해 
	// 부모클래스 메소드에 있는 p01 까지 출력해올 수 있었다. 
    }

}
