class Person2{
    
    String name;
    int age;
    
    public  Person2(String name, int age) {
	this.name = name;
	this.age = age;
    }
    
    @Override // 오버라이딩은 메서드 시그니처가 일치해야 한다. 블록 안의 내용물만 재정의한다.
    public String toString() {
	return String.format("이름 : %s, 나이 : %d세", this.name, this.age);
    }
}

public class Main {

    public static void main(String[] args) {
	Person2 p1 = new Person2("홍길동", 54);
	
	//P1 객체를 출력하면 이름과 나이가 출력 
	System.out.println(p1);  //이름 : 홍길동, 나이 : 54세 

    }

}
