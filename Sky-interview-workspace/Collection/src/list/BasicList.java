package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class BasicList {
	public static void main(String[] args) {
		
		
		List list= new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
	
	System.out.println(list);
	
	//##Itretor example

//	Iterator i = list.iterator(); 
//
//	while (i.hasNext()) {
//
//		System.out.println(i.next());
//	}

	System.out.println();
	
	
	//##ListItretor example //preview

	ListIterator li = list.listIterator();

	while (li.hasNext()) {

		System.out.println(li.next());
	}

	System.out.println();

	while (li.hasPrevious()) {

		System.out.println(li.previous());
	}

	}
	

}
