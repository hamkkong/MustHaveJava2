abstract class UnitRe{ //부모 클래스 
    
    abstract void doMove2();
}
class MarineRe extends UnitRe {  // 자식 클래스 
    void doMove2() {  // 추상 클래스 구현 
	System.out.println("마린은 두 발로 이동합니다.");
    } 
}
class Zergling extends UnitRe { // 자식 클래스 
    void doMove2()  { //추상 클래스 구현 
	System.out.println("저글링은 네 발로 이동합니다.");
    }
}

public class Exam02_MyStarcraft {

    public static void main(String[] args) {
	
	MarineRe unit1 = new MarineRe();
	unit1.doMove2(); 
	Zergling unit2 = new Zergling();
	unit2.doMove2();

    } //기존 클래스 설정과 중복되는 설정이 있어서 이름을 약간 수정하였습니다.

}
