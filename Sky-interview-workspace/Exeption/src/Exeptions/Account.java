package Exeptions;

public class Account {
 double balance=0;
 
 public double getBalance() {
	 return balance;
 }
 public void setBalance(double balance) {
	 this.balance=balance;
 }
 public void withdraw(double amount)throws InsufficientBalance {
	 System.out.println(balance);
	 
	 balance=balance-amount;
	 if (balance<2000) {
		InsufficientBalance b= new InsufficientBalance();
		throw b;
		
	}else {
		System.out.println("your blance is ="+balance);
	}
 }
}
