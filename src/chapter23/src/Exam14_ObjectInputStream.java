import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Exam14_ObjectInputStream {

    public static void main(String[] args) {
	
	try(ObjectInputStream ois =
		new ObjectInputStream(new FileInputStream("Object.bin"))) {
	    
	    Exam12_Unit unit1 = (Exam12_Unit) ois.readObject();
	    System.out.println(unit1.getname());
	    
	    Exam12_Unit unit2 = (Exam12_Unit) ois.readObject();
	    System.out.println(unit2.getname());
	    
	}
	catch(ClassNotFoundException e) {
	    
	    e.printStackTrace();
	}
	catch(IOException e) {
	    
	    e.printStackTrace();
	}
    }

}
