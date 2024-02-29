package bank_balance;

public class TestAccount {
	public static void main(String[] args) {
		
		//Account a=new Account(2000);
		Account a= new Account();
		a.setBalance(2000);
		//a.deposite(400);
		a.withdrow(1000);
	}

}
