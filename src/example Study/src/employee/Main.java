package employee;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

		public static void main(String[] args) {
			Employee e1 = new Employee("Hamkkong");
			Employee e2 = new Employee("Hamkkong");
			List<Employee> employees = new ArrayList<>();
			employees.add(e1);
			employees.add(e2);
					
			int size = employees.stream().distinct().collect(Collectors.toList()).size();
			System.out.println(size);  // 1

	}
} 