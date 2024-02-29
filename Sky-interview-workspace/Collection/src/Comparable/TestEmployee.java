package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<>();

		employee.add(new Employee("Aakash", "Rathod"));
		employee.add(new Employee("Ram", "Patel"));
		employee.add(new Employee("pandey", "rdgjk"));
		employee.add(new Employee("Aakash", "Gupta"));
		employee.add(new Employee("Ram", "werty"));


		System.out.println(employee);

		Collections.sort(employee);

		System.out.println(employee);
	}

}
