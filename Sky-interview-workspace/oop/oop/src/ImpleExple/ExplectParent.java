package ImpleExple;

public class ExplectParent {
	
	public String name;

	public ExplectParent() {
		System.out.println(" Default");
	}
	public ExplectParent(String name)
	{
		this();
		this.name=name;
		System.out.println(name);
	}
}
