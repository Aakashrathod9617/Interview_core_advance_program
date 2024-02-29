package com.rays.thread;

public class DaemonThread extends Thread {

	public void run() {
		System.out.println("Daemon T Started" + currentThread().isDaemon());

		// Infinite loop wake in every 500ms
		while (true) {
			try {
				Thread.sleep(3000);
				System.out.println("Daemon T: woke up Again");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Started");
		// create Thread , make it Daemon & Start
		DaemonThread t = new DaemonThread();
			
			t.setDaemon(true);
			t.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Leaving main method");
		System.out.println("Now JVM will exit");
	}
}