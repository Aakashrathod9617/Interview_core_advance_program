package stream;

import java.util.ArrayList;
import java.util.List;

public class TestSalaryGreaterThan20000 {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<Employee>();

		l.add(new Employee("sohan", 50000));
		l.add(new Employee("nayan", 11000));
		l.add(new Employee("vinay", 40000));

		/*
		 * List<Employee> l1 = l.stream().filter(e -> e.salary >
		 * 20000).collect(Collectors.toList());
		 * 
		 * l1.forEach(e -> System.out.println(e.name + " " + e.salary));
		 */

		l.stream().map(e -> e.salary).filter(e -> e > 20000).forEach(e -> System.out.println(e));
		
		 l.stream()
         .filter(e -> e.salary > 20000)
         .forEach(e -> System.out.println(e.name + " " + e.salary));
	}

}
