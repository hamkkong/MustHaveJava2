package toString_EX;

public class Student {
    private String name;
    private String sex;
    
    public Student(String name, String sex) {
	 this.name = name;
	 this.sex = sex;
	 
    }
    
    @Override
    public String toString() {
	return "이름은 " + name + "이고, 성별은 " + sex + "입니다 ";
    }
}
