package chapter08;

class Book {
    
    String title;
    int price;
    int num = 0;
    
    // 디폴트 생성자에 기능 부여 
    Book(){
	
	title = "자바 프로그래밍";
	price = 30000;
    }
    
    // 생성자의 오버로딩
    Book(String t, int p) {
	title = t;
	price = p;
    }
    
    void print()  {
	
	System.out.println("제   목 : " + title);
	System.out.println("가   격 : " + price);
	System.out.println("주문수량 : " + num);
	System.out.println("합계금액 : " + price*num);
    }
}
public class Exam03_ConstructorUse {

    public static void main(String[] args) {
	Book book1 = new Book();  // 디폴트 생성자 사용 
	book1.print();
	
	Book book2 = new Book("자바 디자인패턴", 35000); 
	book2.num = 10;
	book2.print();
    }

}
