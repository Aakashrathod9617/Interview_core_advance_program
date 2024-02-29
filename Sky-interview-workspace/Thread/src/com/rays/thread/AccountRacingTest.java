package com.rays.thread;

public class AccountRacingTest {
	public static void main(String[] args) {
		AccountRacing r = new AccountRacing("Ram");
		AccountRacing r1 = new AccountRacing("Shyam");
		r.start();
		r1.start();
	}
}


