package oop;

public class ExplicitParent {
	public String name;

	public ExplicitParent() {
		System.out.println("this is parent class");
	}

	public ExplicitParent(String name) {
		this();
		this.name = name;
		System.out.println(name);
	}


}
