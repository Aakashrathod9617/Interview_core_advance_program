package polymorphisms;

public class ConstructorOverloadings {

	private int i;
	private String name;
	private String lastname;

	public ConstructorOverloadings() {
		System.out.println("this is default constructure");
	}

	public ConstructorOverloadings(int i) {

		this.i = i;
		System.out.println(i);

	}
	
	public ConstructorOverloadings(int i,String name) {

		this.i = i;
		this.name=name;
		System.out.println(name);
		System.out.println(i);

	}

	public ConstructorOverloadings(String name, String lastname) {
		this.name = name;
		this.lastname = lastname;

		System.out.println(name + lastname);

	}

	public static void main(String[] args) {

		ConstructorOverloadings c = new ConstructorOverloadings();
		ConstructorOverloadings c1 = new ConstructorOverloadings(10);
		ConstructorOverloadings c3 = new ConstructorOverloadings(28,"sourabh");

		ConstructorOverloadings c2 = new ConstructorOverloadings("naman", "meena");

	}

}
