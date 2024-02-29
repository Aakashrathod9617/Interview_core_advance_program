package oop;

public class DeepStudent implements Cloneable{
	
public int rollNo;
public DeepAddress add;

public int getRollNo() {
	
	return rollNo;
	
}
public void setRollNo(int rollNo) {
	this.rollNo=rollNo;
	
}
public DeepAddress getAdd() {
	return add;
			
}
public void setAdd(DeepAddress add) {
	this.add=add;
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		DeepStudent student= (DeepStudent) super.clone();
		student.add=(DeepAddress)add.clone();
		return student;
	}

}