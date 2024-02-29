package com.rays.mythread;

public class JoinMethod extends Thread {

	public void run() {
		System.out.println(getName());
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		JoinMethod t1 = new JoinMethod();
		JoinMethod t2 = new JoinMethod();
		JoinMethod t3 = new JoinMethod();

		t1.setName("Sumit");
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		t2.setName("Amit");
		t2.start();
		try {
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		t3.setName("Loken");
		t3.start();

	}
}