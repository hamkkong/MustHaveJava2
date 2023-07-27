package getClass_EX;
import java.lang.reflect.Field;  //Field 와 Method를 사용하려는 경우 반드시 임포트를 해줘야 함. 
import java.lang.reflect.Method;
public class HelloWorld {

    public static void main(String[] args) {
	Person p1 = new Person("홍길동",10);  // 클래스가 있는 객체 생성 
	Class c1 = p1.getClass();  // 클래스의 내용을 받아 생성 
	
	System.out.println(c1.getName());
	System.out.println(c1.getSuperclass().getName());
	
	Field[] field = c1.getDeclaredFields();
	for (int i = 0; i < field.length; i++) {
	    	System.out.println("멤버변수" + i + ":" + field[i]);
	}
	
	Method[] method = c1.getDeclaredMethods();
	for (int i = 0; i < method.length; i++) {
	    	System.out.println("멤버함수" + i + ":" + method[i]);
	}
	
	

    }

}
