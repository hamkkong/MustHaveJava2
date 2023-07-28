package enumEX;

public class TestEnum2 {
    
    enum Company { SK, LG, KT, SAMSUNG, APPLE }
    
    public static void main (String[] args) {
	
	int test = 1;
	if (test == 1) 
	    switchFt(Company.SAMSUNG);
	else if (test == 2)
	    switchFt(Company.SK);
	else if (test == 3)
	    switchFt(Company.LG);
	else if (test == 4)
	    switchFt(Company.KT);
	else if (test == 5)
	    switchFt(Company.APPLE);
		
    }
    
    public static void switchFt(Company company) {
	
	switch(company) {
	case SK : 
	    System.out.println("SK 입니다.");
	    break;
	case LG : 
	    System.out.println("LG 입니다.");
	    break;
	case KT : 
	    System.out.println("KT 입니다.");
	    break;
	case APPLE : 
	    System.out.println("APPLE 입니다.");
	    break;
	case SAMSUNG : 
	    System.out.println("SAMSUNG 입니다.");
	    break;
	}
 
    
    }


}


