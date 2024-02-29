package com.rays.mythread;                      

public class AccountRacingTest {
	public static void main(String[] args) {
		AccountRacing r = new AccountRacing("Amit");
		AccountRacing r1 = new AccountRacing("Sumit");
		r.start();
		r1.start();
	}
}
 