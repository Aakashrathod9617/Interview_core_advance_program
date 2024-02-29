package list;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerationss {
	
	public static void main(String[] args) {
		
	Vector v= new Vector();
	
	v.add(1);
	v.add(2);
	v.add(3);
	
	Enumeration en = v.elements();
	
	while(en.hasMoreElements()) {
		System.out.println(en.nextElement());
	}
	
	}	
}
