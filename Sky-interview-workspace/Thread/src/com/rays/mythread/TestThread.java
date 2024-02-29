package com.rays.mythread;

public class TestThread extends Thread {

	private String name;

	public TestThread(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 2; i++) {

			System.out.println(i + " " + name);

		}
	}

	public static void main(String[] args) {

		TestThread t1 = new TestThread("Krishhna");
		TestThread t2 = new TestThread("Raj");

		t2.start();
		t1.start();

	}

}
