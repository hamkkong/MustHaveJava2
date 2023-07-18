interface Myinterface{
    
    void myInterface();
}

class Interface1 implements Myinterface {

    @Override
    public void myInterface() { //인터페이스 구현 
	System.out.println(this instanceof Myinterface);
	
    }
     
}

public class InstanceofTest2 {

    public static void main(String[] args) {
	
	Interface1 inter1 = new Interface1();
	inter1.myInterface();
    }

}  //자바 버전을 업그레이드 하지 않으면 true가 실행되지 않는다. 
