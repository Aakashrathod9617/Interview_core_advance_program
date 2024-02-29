package oop;



public class ShallowClonee implements Cloneable{
	
public int rollNo;


	@Override
	protected Object clone()throws CloneNotSupportedException {
		return super.clone();
	}

}

