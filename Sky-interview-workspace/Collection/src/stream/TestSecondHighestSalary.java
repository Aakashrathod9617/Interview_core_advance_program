package stream;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class TestSecondHighestSalary {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<>();

		
		
		l.add(new Employee("A", 30000));
		l.add(new Employee("B", 60000));
		l.add(new Employee("C", 36000));

		double d = l.stream().map(e -> e.salary).distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().orElse(0.0);
				
		System.out.println(d);

	}
}
