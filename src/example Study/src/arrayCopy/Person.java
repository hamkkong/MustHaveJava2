package arrayCopy;

import java.util.Arrays;
import java.util.Objects;

public class Person{
    
    private String Name;
    private int Age;
    
    public Person(String name, int age) {
	Name  = name;
	Age = age;
    }
    
    public String getName() {
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
    
    
   @Override
   public boolean equals(Object o) {
       if (this == o)
	   return true;
       if (o == null || getClass() != o.getClass())
	   return false;
       Person person = (Person) o;
       return Objects.equals(Name, person.getName()) && Objects.equals(Age, person.getAge());
       
       }
   @Override
   public int hashCode() {
	   return Objects.hash(Name, Age);
   }
   
    public static void main(String[] args) {
	Person[] personArray1 = new Person[] {
		new Person("둘리", 20),
		new Person("또치", 30),
	};
	
	Person[] personArray2 = new Person[] {
		new Person("둘리", 20),
		new Person("또치", 100),
	};
	
	System.out.println("Arrays.equals() 메서드의 결과 : " + 
		Arrays.equals(personArray1, personArray2));
	
	System.out.println("Arrays.deepEquals() 메서드의 결과 : " + 
		Arrays.deepEquals(personArray1, personArray2));

    }

}
