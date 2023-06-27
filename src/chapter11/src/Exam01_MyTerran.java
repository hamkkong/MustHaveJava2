class Unit   { // 부모 클래스  (클래스 중복오류때문에 원래 만들었던 파일에서 수정)
    String name;
    int hp;
  void doMove() {  //메서드 정의 
      
      System.out.println("이동속도 10으로 이동");
      
    }
    
}

class Marine extends Unit  {  // 자식 클래스 
    
    int attack;
    
    void doMove() { // 부모 메서드와 같은 이름의 자식 메서드
	
	super.doMove(); //부모 메서드 호출 
	    System.out.println(attack + "공격");
	
    }

   
}

class Medic extends Unit  {  // 자식 클래스 
    
    int heal;        // 멤버 변수 
   
    void doMove() {  //부모 메서드와 같은 이름의 자식 메서드
	
	System.out.println("이동속도 8으로 이동");
	System.out.println(heal + "치유");
    }

  
}
public class Exam01_MyTerran {

    public static void main(String[] args) {
	Marine unit1 = new Marine();
	unit1.name = "마린";
	unit1.hp = 100;
	unit1.attack = 20;
	
	Medic unit2 = new Medic();
	unit2.name = "메딕";
	unit2.hp = 120;
	unit2.heal = 10;
	
	unit1.doMove();
	System.out.println();
	unit2.doMove();
	

    }

}
