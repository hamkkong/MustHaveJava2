package innerEx;
	
public class InnerClass2 {
    
    private int a;
    private int b;
    private static int c;
    
    public InnerClass2() {
	a = 1;
	b = 2;
	c = 3;
    }
    
    //멤버 이너 클래스 
    class AInner{
	public void disp() {
	    System.out.println(a);  // 원래 접근이 되면 안되지만,
	    System.out.println(b);  // outer의 멤버를 자유롭게 사용가능 
	    System.out.println(c);  // outer객체 생성 후 inner 객체를 생성해야 한다. 
	    			    // 단, static은 outer를 생성하지 않고 사용가능
	}
    }

    public static void main(String[] args) {
	//1. outer 객체 생성 후
	// outer 객체.inner객체 b = outer레퍼런스 .new inner();
	InnerClass2 a = new InnerClass2();
	InnerClass2.AInner b = a.new AInner();
	b.disp();
	
	//한 줄로 작성하는 방법 
	InnerClass2.AInner c = new InnerClass2().new AInner();
    }

}
