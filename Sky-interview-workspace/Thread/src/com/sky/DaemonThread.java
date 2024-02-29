package com.sky;



public class DaemonThread extends Thread {

	@Override
	public void run() {
		System.out.println("Demon" + currentThread().isDaemon());
		
		while (true) {
			try {
				Thread.sleep(2000);
				System.out.println("Demon wake up");
			} catch (InterruptedException e) {
			
				System.out.println(e);
			}
			
		}
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		
		DaemonThread m= new DaemonThread();
		m.setDaemon(true);
		m.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			System.out.println(e);
		}
		
		System.out.println("Leave main method");
		System.out.println("Now JVM will start");
	}
}
