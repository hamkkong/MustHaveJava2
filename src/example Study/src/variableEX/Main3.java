package variableEX;



public class Main3 {
   
    
    public static void main(String[] args) {
	  
		
	exampleMethod("fruits : ", "apple", "banana", "cherry");
	
	}
    	
    	public static void exampleMethod(String prefix, String... str) {
	    
	 for (String s : str) {
	     System.out.print(prefix);
	     
	     System.out.print(s + " ,");
	 }
	    System.out.println();
     
    }

}
