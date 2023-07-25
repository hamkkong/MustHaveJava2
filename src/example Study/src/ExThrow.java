

public class ExThrow {
    
    public void method1() {
	try {
	    method2(); // throws가 붙은 method2는 반드시 이렇게 try 안에서 호출해야 함.
	    //method2가 떠넘긴 예외를 아래 catch문을 통해 처리해주고 있음. 
	}
	catch(ClassNotFoundException e1) {
	    System.out.println("클래스가 존재하지 않음.");
	}
	
    }
    
    public void method2() throws ClassNotFoundException {
	    Class clazz = Class.forName("java.lang.String22");
	}

    public static void main(String[] args) {
	
	ExThrow et = new ExThrow();
	
	et.method1();

    }

}
