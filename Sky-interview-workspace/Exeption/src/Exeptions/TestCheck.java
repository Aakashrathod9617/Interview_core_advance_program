package Exeptions;

public class TestCheck {
	public static void main(String[] args) {
		
		dad();
	}

	public static void dad() {
		
		try {
			mom();
		} catch (Check e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void mom()throws Check {
		son();
	}
	public static void son()throws Check {
		Check c= new Check();
		
		throw c;
	}

}
