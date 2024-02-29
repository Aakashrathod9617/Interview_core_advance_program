package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArrayListMethods {
	

	public static void main(String[] args) {
//
//		ArrayList li = new ArrayList();
//		li.add(10);
//		li.add(20);
//		System.out.println(li);
//
//		System.out.println("addAllmethodExample");
//
//		ArrayList li2 = new ArrayList();
//		li2.add(30);
//		li2.add(40);
//		li2.add(10);
//		li2.add(20);
//		
//		li.containsAll(li);
//		li2.contains(li);
//		//li2.addAll(li);
//		//li2.retainAll(li);
//		//li2.removeAll(li);
//		
//		System.out.println(li2);
//
////		// li2.clear();
////
////		//li.removeAll(li);
////		//System.out.println(li2);
////		//System.out.println(li.size());
		
		SortedSet s= new TreeSet();
		
		s.add("One");
		s.add("Two");
		s.add("Three");
	
		
		
		System.out.println(s);
		System.out.println(s.subSet("One", "Two"));
		
		
		
		
////		ArrayList<Integer> li = new ArrayList();
////		li.add(10);
////		li.add(20);
////		li.add(10);
////		li.add(30);
////		li.add(40);
////		li.add(40);
////		li.add(60);
////		li.add(20);
////		
//		   // Using LinkedHashSet to remove duplicates while preserving order
////        LinkedHashSet<Integer> set = new LinkedHashSet<>(li);
////
////        // Creating a new ArrayList from the set
////        List uniqueList = new ArrayList(set);
////
////        System.out.println(uniqueList);
//		
//        // Using a loop and a new list to remove duplicates
////        List<Integer> uniqueList = new ArrayList<>();
////        for (Integer item : li) {
////            if (!uniqueList.contains(item)) {
////                uniqueList.add(item);
////            }
////        }
////
////        System.out.println(uniqueList);

		
	}

}
