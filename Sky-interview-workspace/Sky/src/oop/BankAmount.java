package oop;

public class BankAmount {
private double balance;

public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance=balance;
}
public void deposite(double amaunt) {
	System.out.println(balance);
	balance=balance+amaunt;
	System.out.println("your balance is:"+ balance);
}
public void withdraw(double amaunt) {
	if (balance>2000) {
		balance=balance-amaunt;
	}else {
		System.out.println("Insuffician balance!!!!!!!!!!!");
	}
}
}
