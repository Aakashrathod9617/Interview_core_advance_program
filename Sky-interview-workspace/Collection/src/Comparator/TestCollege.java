package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollege {
	
	public static void main(String[] args) {

		List<College> college = new ArrayList<>();

		college.add(new College("S","A", 1 ,40000));
		college.add(new College("S","B", 2 ,20000));
		college.add(new College("b","C", 3,20000));
		
		System.out.println(college + "\n");
		
		OrderByCollegeName  o = new OrderByCollegeName();
		
		Collections.sort(college, o);
		System.out.println(college + "\n");
		
		OrderByCollegeNo o1 = new OrderByCollegeNo();
		
		Collections.sort(college, o1);
		System.out.println(college + "\n");
		
		OrderBySalary o2= new OrderBySalary();
		
		Collections.sort(college,o2);
		
		System.out.println(college);
		
	}



}
