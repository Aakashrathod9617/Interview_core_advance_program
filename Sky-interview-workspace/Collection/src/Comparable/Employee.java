package Comparable;

public class Employee implements Comparable<Employee> {
//	private String name;
//	private int id;
//
//	public Employee(String name, int id) {
//
//		this.name = name;
//		this.id = id;
//	}
//
//	public String toString() {
//
//		return (id + " " + name);
//	}
//
//	@Override
//	public int compareTo(Employee e) {
//
//		if (this.id == (e.id)) {
//
//			return name.compareTo(e.name);
//
//		} else {
//
//			return this.id - e.id;
//		}
//
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public int getId() {
//		return id;
//	}
//
////	@Override
////	public int compareTo(Employee e) {
////	if (this.id > e.id )  {
////		
////		return -1;
////	}else if (this.id== e.id) {
////		return 0;
////	}else {
////		return 1;
////	}
////		
////	}
	
	private String FName;
	private String LName;
	
	
	
	
	
	public Employee(String fName, String lName) {
		
		this.FName = fName;
		this.LName = lName;
	}





	public String getFName() {
		return FName;
	}





	public String getLName() {
		return LName;
	}



	


	@Override
	public String toString() {
		return (FName + " " + LName);
		
	}





	@Override
	public int compareTo(Employee o) {
	
		
		
		if(this.FName == (o.FName)) {
			return this.LName.compareTo(o.LName);
		}else {
			
			return this.FName.compareTo(o.FName);
		}
	}

}
