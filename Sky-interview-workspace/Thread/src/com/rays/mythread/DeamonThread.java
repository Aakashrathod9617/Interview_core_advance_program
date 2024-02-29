package com.rays.mythread;

public class DeamonThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		 System.out.println("Daemon T Started : " + currentThread().isDaemon());

		while (true) {
			try {
				Thread.sleep(500);
				System.out.println("Daemon T: woke up Again");

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Main");

		DeamonThread d = new DeamonThread();
		d.setDaemon(true);
		d.start();

		try {

			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
