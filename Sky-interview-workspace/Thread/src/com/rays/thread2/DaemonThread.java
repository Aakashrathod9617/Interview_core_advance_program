package com.rays.thread2;

public class DaemonThread extends Thread {

	@Override
	public void run() {
		System.out.println("Daemon " + currentThread().isDaemon());

		while (true) {
			try {
				Thread.sleep(2000);
				System.out.println("Daemon Woke Up");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		DaemonThread t = new DaemonThread();
		t.setDaemon(true);
		t.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Leave Main Method");
		System.out.println("Now JVM will exit");

	}

}
