package com.rays.thread;

public class Bank extends Thread {
//	int balance = 5000;
//	int withdraw;

	static int balance = 5000;
	static int withdraw;

	public Bank(int withdraw) {
		this.withdraw = withdraw;
	}

	public static synchronized void withdraw() {
		String name = currentThread().getName();
		if (withdraw <= balance) {
			System.out.println(name + " Withdraw money....");
			balance = balance - withdraw;
		} 
	}
	@Override
	public void run() {
		withdraw();
	}
}
