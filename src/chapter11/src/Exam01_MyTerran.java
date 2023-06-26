class Unit   { // 부모 클래스 
    String name;
    int hp;
    void printUnit() {
	System.out.println("이름 : " + name);
	System.out.println("HP : " + hp);
    }
    
}

class Marine extends Unit  {  // 자식 클래스 
    
    int attack;
    
    void printMarine() {
	
	printUnit();
	System.out.println("공격력 : " + attack);
    }

   
}

class Medic extends Unit  {  // 자식 클래스 
    
    int heal;        // 멤버 변수 
   
    void printMedic() {
	
	printUnit();
	System.out.println("치유량 : " + heal);
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
	
	unit1.printMarine();
	System.out.println();
	unit2.printMedic();
	

    }

}
