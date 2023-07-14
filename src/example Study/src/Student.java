
public class Student {
    //필드(Field)
    
    String name;  //이름 (한 줄 이상의 문장을 입력할 때는 String) 
    int age; // 나이 (정수 입력시에는 int)
    int korean_score; // 국어성적
    int math_score; //수학성적
    int english_score;  //영어성적
    
    
    //생성자 
    
   Student(String name, int age, int kor_score, int mat_score, int eng_score) {
       this.name = name;
       this.age = age;
       this.korean_score = kor_score;
       this.math_score = mat_score;
       this.english_score = eng_score;
   }
   
   //메소드 
   public void printScore() {
       System.out.println("이름 : " + name);
       System.out.println("나이 : " + age);
       System.out.println("국어성적 : " + korean_score);
       System.out.println("수학성적 : " + math_score);
       System.out.println("영어성적 : " + english_score);
       
   }
}
