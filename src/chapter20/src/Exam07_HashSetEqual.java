import java.util.HashSet;

    class Student {
        
        private String name;
        private int age;
        
        public Student(String name, int age) {
    	
    	this.name = name;
    	this.age = age;
        }
        
        public String toString() {
    	
    	return name + ":" + age;
        }
        
        public int hashCode() {
        
    	int num = age % 3;
    	System.out.println(num);
        return num;
        }
        
   
    
//   public int hashCode() {
	
//	int num = java.util.Objects.hash(name, age);
//	System.out.println(num);
//	return num;
//   }
   public boolean equals(Object obj) {
	
	System.out.println("비교를 합니다.");
	if(age == ((Student)obj).age)
	    return true;
	else
	    return false;
   }
}

public class Exam07_HashSetEqual {

    public static void main(String[] args) {
	HashSet<Student> set = new HashSet<>();
	set.add(new Student("홍길동", 20));
	set.add(new Student("전우치", 20));
	set.add(new Student("홍길동", 25));
	
	System.out.println("객체 수 : " + set.size());
	
	for(Student s : set)
	    System.out.print(s.toString()+ '\t');
	
	System.out.println();

    }

}
