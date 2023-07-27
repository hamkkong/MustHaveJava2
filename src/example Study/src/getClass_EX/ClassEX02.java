package getClass_EX;

class Student{
    String name;
    int age;
    public Student(String name, int age) {
	this.name = name;
	this.age = age;
    }
    public void speak() {
	System.out.println("나는" + name + "이고, 나이는 " + age + "입니다.");
    }
}
public class ClassEX02 {

    public static void main(String[] args) {
	
	Student student1 = new Student("Morph", 10);
	
	Class cls = student1.getClass();
	
	System.out.println("getName():"+ cls.getName());
	System.out.println("getSuperclass():"+ cls.getSuperclass());
	System.out.println("getDeclaredFields():"+ cls.getDeclaredFields());
	
	student1.speak();

    }

}
