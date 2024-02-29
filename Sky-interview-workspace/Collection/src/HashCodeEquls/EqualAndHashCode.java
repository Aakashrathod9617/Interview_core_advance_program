package HashCodeEquls;

public class EqualAndHashCode {

	public String name;
	public String rollno;
	public Integer marks;

	public EqualAndHashCode(String n, String r, int m) {
		this.name = n;
		this.rollno = r;
		this.marks = m;

	}

	public boolean equals(Object obj) {

		EqualAndHashCode m = (EqualAndHashCode) obj;
		boolean b = rollno.equals(m.rollno) && marks.equals(m.marks) && name.equals(m.name);
		return b;
	}

	public int hashcode() {

		String key = rollno + marks + name;
		return key.hashCode();

	}



	
	

	
//	  public String toString() { 
//		  return (name + " " + rollno + " " + marks);
//	  
//	 }
	 
}
