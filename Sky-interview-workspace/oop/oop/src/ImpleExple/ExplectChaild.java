package ImpleExple;

public class ExplectChaild extends ExplectParent{
	
	public String surname;
	
	public ExplectChaild() {
		System.out.println("Second Deafult");
	}
	
	public ExplectChaild(String surname) {
		super();
		this.surname=surname;
		System.out.println(surname);
	}
	

}
