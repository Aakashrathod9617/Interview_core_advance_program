package com.rays.mythread;

public class Account {
	private double balance;

	public double getBalance() {
		 delay();
		return balance;
	}

	public void setBalance(double balance) {
         delay();
		this.balance = balance;
	}


	public void deposit(String msg, double amt) {

		 synchronized (this) {

		double bal = getBalance() + amt;
		setBalance(bal);

		System.out.println(msg + " ->new balance = " + bal);
	}
	}

	public void delay() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
