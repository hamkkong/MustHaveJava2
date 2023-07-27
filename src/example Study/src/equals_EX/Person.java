package equals_EX;

import java.util.Objects;

public class Person {
    private int age;  // 필드값  
    
    public Person(int age) {   // 생성자 
	this.age = age;
    }
    
    @Override 
    public boolean equals(Object obj) {     //equals() 오버라이드 
	if (obj instanceof Person) {        // 형변환 체크 
	    	Person person = (Person) obj;   // 형변환 (다운캐스팅)
	    	return age == person.age;
	}
	else {
	    return false;
	}
    }
    
    @Override
    public int hashCode() {		  //보통 equals()와 함께 오버라이드함
		return Objects.hash(age);
    }
    

}
