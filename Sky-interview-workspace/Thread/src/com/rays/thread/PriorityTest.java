package com.rays.thread;

public class PriorityTest extends Thread {
	
	//parameterized constructor
	public PriorityTest(String name) {
		super(name);
	}


	public void run() {
		for(int i = 0; i<2; i++) {
			System.out.println(getName() +" P = "+getPriority());
		}
	}
	public static void main(String[] args) {
		//Create threads
		PriorityTest t1 = new PriorityTest("Thread#A");
		PriorityTest t2 = new PriorityTest("Thread#B");
		PriorityTest t3 = new PriorityTest("Thread#C");
		
		t1.setPriority(10);
		t2.setPriority(1);
		//t3 has a default priority 5
		
		//start threads
		t1.start();
		t2.start();
		t3.start();
		
	}

}

