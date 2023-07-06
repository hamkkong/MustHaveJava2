import java.util.Set;
import java.util.TreeSet;

class Student2 implements Comparable<Student2> {
    
    private String name;
    private int age;
   
    public Student2(String name, int age) {
	
	this.name = name;
	this.age = age;
    }
    
    public String toString() {
	
	return name + ":" + age ;
    }
    
    public int compareTo(Student2 p) {
	
	return this.age - p.age;
//		return p.age - this.age;
//		return this.name.compareTo(p.name);
//		return p.name.compareTo(this.name);
    }
}

public class Exam09_Comparable {

    public static void main(String[] args) {
	
	Set<Student2> tree = new TreeSet<>();
	tree.add(new Student2("홍길동", 30));
	tree.add(new Student2("전우치", 40));
	tree.add(new Student2("손오공", 20));
	
	for(Student2 s : tree)
	    System.out.println(s);

    }

}
