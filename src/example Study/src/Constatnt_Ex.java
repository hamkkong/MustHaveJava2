
public class Constatnt_Ex {

    public static void main(String[] args) {
	//상수 사용법
	System.out.println(Table.PI);
	System.out.println(Table.NUMBER);
	System.out.println(Table.EARTH_RADIUS);

    }
    
    class Table{
	
	public static final double PI = 3.14;
	public static final int NUMBER = 32;
	public static final long EARTH_RADIUS = 6400L;
	    
	
    }

}
