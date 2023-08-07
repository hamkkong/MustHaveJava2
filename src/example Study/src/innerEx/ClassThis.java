package innerEx;

public class ClassThis{  //상속관계에 있는 클래스 만들기 
  
 // 외부 클래스    
    public void print(String txt) {
	System.out.println(txt);
    }
    
    // 내부 클래스
     class Sub {
	 public void  print() {
	     ClassThis.this.print("외부 클래스 메서드 호출");  // ClassThis의 메서드 호출 (Main)
	     System.out.println("내부 클래스 메서드 호출");    // Sub의 메서드 호출
	     
	 }
     }



    public static void main(String[] args) {
	ClassThis.Sub s = new ClassThis().new Sub();
	s.print();   // ClassThis 와 Sub의 모든 메서드 호출함 = ClassThis 안의 Sub의 메서드를 호출(상속)

    }

}
