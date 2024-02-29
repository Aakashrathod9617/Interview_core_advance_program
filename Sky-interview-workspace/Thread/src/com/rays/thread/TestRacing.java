package com.rays.thread;

public class TestRacing {

	public static void main(String[] args) {
		AccountRacing r = new AccountRacing("Ram");
		AccountRacing r1 = new AccountRacing("Shyam");
		r.start();
		r1.start();
	}

}
 