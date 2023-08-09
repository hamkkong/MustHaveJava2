package employee;

import java.util.Objects;

public class Employee {
   
    private String name;

    public Employee(String name) { // 생성자
	this.name = name;
    }

    public String getName() { // get 메서드 or getter
	return name;
    }
    
    @Override
    public boolean equals(Object o) {
	if (this == o) return true;
	if (o == null || getClass() != o.getClass()) return false;
	Employee employee = (Employee) o;
	return Objects.equals(name, employee.name);
    }
    
    @Override
    public int hashCode() {
	return Objects.hash(name);
    }
}