package oop;

public class DeepTest{
	
	public static void main(String[] args) throws CloneNotSupportedException {
	DeepAddress address=new DeepAddress();
	address.setCity("indore");
	
	DeepStudent student =new DeepStudent();
	student.setRollNo(101);
	student.setAdd(address);
	
	DeepStudent student2=(DeepStudent)student.clone();
	student2.setRollNo(102);
	student2.add.city="Bhopal";
	
	System.out.println(student.getRollNo());
	System.out.println(student.getAdd().city);
	
	
	
	System.out.println("___________________________________________");
	
	System.out.println(student2.getRollNo());
	System.out.println(student2.getAdd().city);
	}

			
			
}