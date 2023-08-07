package innerEx2;


 public class Animal3{
    public static void main(String[] args) {
	// 인터페이스 익명 구현 객체 생성 
	IAnimal dog = new IAnimal() {
	  
	    @Override
	    public String bark() {
		return "개가 짖습니다";
	    }
	    
	    @Override
	    public String run() {
	    return "개가 달립니다";
	   }

	};
   
	
	// 인터페이스 구현 객체 사용
	System.out.println(dog.bark());
	System.out.println(dog.run());

    }

}
