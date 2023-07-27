package getClass_EX;

public class Person {  // 필드
    public String name; 
    private int age;
    
    public Person(String name, int age) {  // 생성자 
	this.name = name;
	this.age = age;
    }
    
    public void speak() {  // 메서드 
	System.out.println(name + "입니다.");
    }

}
