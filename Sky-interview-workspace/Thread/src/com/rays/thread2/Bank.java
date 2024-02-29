package com.rays.thread2;

public class Bank extends Thread {

	static int balance = 3000;
	static int withdraw;

	public Bank(int withdraw) {
		this.withdraw = withdraw;
	}

	public static synchronized void withdraw() {
		String name = currentThread().getName();
		if (withdraw <= balance) {
			System.out.println(name + "Witdraw MOney ...");
			balance = withdraw - balance;
		}
	}

	@Override
	public void run() {
		withdraw();
	}

}
