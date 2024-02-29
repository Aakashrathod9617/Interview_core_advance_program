package bank_balance;

public class Account {

	public double balance;
	
	
//
//	public Account(double balance) {
//		
//		this.balance = balance;
//	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void deposite(double amaunt) {
		System.out.println(balance);
		balance=balance+amaunt;
		System.out.println("your balance is:"+ balance);
	}
	public void withdrow(double amaunt) {
		if (balance>2000) {
			balance=balance-amaunt;
			System.out.println(balance);	
		}else {
			System.out.println("Insuffician balance!!!!!!!!!!!");
		}
		
	}
	
	
	
}
