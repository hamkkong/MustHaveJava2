@FunctionalInterface
interface Unit11 {
    
    String move();
//    void attack();
}

public class Exam11_Functional {

    public static void main(String[] args) {
	Unit11 unit = () -> {
	    return "인간형 유닛 이동";
	};
	System.out.println(unit.move());
    }

}
