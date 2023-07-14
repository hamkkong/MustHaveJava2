
public class Exam02_MultiplicationTable {

    public static void main(String[] args) {
	for (int i = 2; i<10; i++) {
	    
	    System.out.print("[" + i + "단]"+ "\t");
	    
	    for (int j = 2 ; j<10; j++) {
		
		System.out.print(i + "*" + j +"=" + i*j + "\t");
		
	    }
	    System.out.println();
	}
    }

}
