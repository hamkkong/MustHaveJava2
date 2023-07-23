package arrayCopy;

import java.util.Arrays;

public class Person{
    
    private String Name;
    private int Age;
    
    public Person(String name, int age) {
	Name  = name;
	Age = age;
    }
    
    public String getname() {
	return Name;
    }
    
    public void setname(String name) {
	Name = name;
    }
    
    public int getAge() {
	return Age;
    }
    
    public void setAge(int age) {
	this.Age = age;   // this. 를 사용해도 되고 생략해도 된다. 
    }
    
 
    public static void main(String[] args) {
	Person[] personArray1 = new Person[] {
		new Person("둘리", 20),
		new Person("또치", 30),
	};
	
	Person[] personArray2 = new Person[] {
		new Person("둘리", 20),
		new Person("또치", 30),
	};
	
	System.out.println("Arrays.equals() 메서드의 결과 : " + 
		Arrays.equals(personArray1, personArray2));
	
	System.out.println("Arrays.deepEquals() 메서드의 결과 : " + 
		Arrays.deepEquals(personArray1, personArray2));

    }

}
