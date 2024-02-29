package Comparator;

public class College {

	public String name;
	public String Lname;
	public int id;
	public int salary;

	public College(String a,String l, int b ,int c) {

		this.name = a;
		this.Lname=l;
		this.id = b;
		this.salary=c;
	}

	public String toString() {
		return (name + " " + Lname + " " + id +" "+ salary);

	}
}
