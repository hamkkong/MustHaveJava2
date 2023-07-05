class MyData {
    
    public static <T> T showData(T data) {
	
	if (data instanceof String)
	    System.out.println("String");
	
	else if (data instanceof Integer)
	    System.out.println("integer");
	else if (data instanceof Double)
	    System.out.println("Double");
	
	return data;
    }
}

public class Exam09_GenericMethod {

    public static void main(String[] args) {
	
	MyData.<String>showData("Hello World");
	MyData.showData(1);
	MyData.showData(1.0);

    }

}
