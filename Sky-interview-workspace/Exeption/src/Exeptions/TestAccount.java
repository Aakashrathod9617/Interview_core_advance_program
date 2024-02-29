package Exeptions;

public class TestAccount {
	public static void main(String[] args) {
		
	
	
	Account a= new Account();
	a.setBalance(20000);
	
	try {
		a.withdraw(19000);
	} catch (InsufficientBalance e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	}
}
