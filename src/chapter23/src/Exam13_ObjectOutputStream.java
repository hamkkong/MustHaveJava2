import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exam13_ObjectOutputStream {

    public static void main(String[] args) {
	
	Exam12_Unit unit1 = new Exam12_Unit("Marine");
	Exam12_Unit unit2 = new Exam12_Unit("Medic");
	
	try (ObjectOutputStream oos = 
		new ObjectOutputStream(new FileOutputStream("Object.bin"))) {
	    
	    oos.writeObject(unit1);
	    oos.writeObject(unit2);
	}
	catch(IOException e) {
	    
	    e.printStackTrace();
	}
    }

}
