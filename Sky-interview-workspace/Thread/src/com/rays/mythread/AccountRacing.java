package com.rays.mythread;

public class AccountRacing extends Thread {

	 static Account a = new Account();

	public AccountRacing(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i <= 4; i++) {
			a.deposit(getName(), 1000);
		}
	}
}