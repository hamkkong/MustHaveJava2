package boxing;

public abstract class Number implements java.io.Serializable {

    	public Number() {super();}
    
    	public abstract int  intValue();
    	
    	public abstract int  longValue();
    	
    	public abstract int  floatValue();
    	
    	public abstract int  doubleValue();
    	
    	public int  byteValue() {
    	    return (byte)intValue();
    	}
    	
    	public int  shortValue() {
    	    return (short)intValue();
    	}

    	
}	
    	