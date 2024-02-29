package com.rays.thread2;

public class PriorityThread extends Thread {

	public PriorityThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(getName() + " -> PR  " + getPriority());
		}
	}

	public static void main(String[] args) {
		PriorityThread t = new PriorityThread("Gopal");
		PriorityThread t1 = new PriorityThread("Krishna");

		t.setPriority(9);
		t1.setPriority(8);
		t.start();
		t1.start();
	}
}
