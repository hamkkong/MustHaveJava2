public class Person {
    
//final 변수는 반드시 초기화 시켜줘야 함.
   public final String nation = "대한민국"; // 직접 초기화 - 한가지 값만 가짐 
   public final String number; 
   String name;
       
// String final number 변수 생성자로 초기화 - 객체마다 다른 값을 가짐 
   public Person(String number, String name) {  //생성자 만들어줌 
       this.number = number;
       this.name = name;
   }
}
