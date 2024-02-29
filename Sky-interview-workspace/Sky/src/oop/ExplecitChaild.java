package oop;

public class ExplecitChaild extends ExplicitParent{

	public String surname;;
	
	public ExplecitChaild() {
		System.out.println("this is child class");
	}
	
	public ExplecitChaild(String surname) {
		super();
		this.surname=surname;;
		System.out.println(surname);
	}
	

}
