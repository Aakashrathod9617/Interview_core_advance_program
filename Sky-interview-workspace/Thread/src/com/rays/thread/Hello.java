package com.rays.thread;

public class Hello extends Thread{
	private String name = null;

	public Hello(String n) {
		this.name = n;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "#" + name);
		}
	}
	public static void main(String[] args) {
		//Create thread
		Hello h1 = new Hello("Gopal");
		Hello h2 = new Hello("Tyagi");
	
		h1.start();
		h2.start();
		
		//Main itself is a thread
		for (int i = 0; i < 10; i++) {
			
			System.out.println(i+"I am Main");
		}
	}
}
