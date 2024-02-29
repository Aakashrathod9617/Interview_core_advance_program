package com.rays.thread;

public class PlayerThread extends Thread {
	public PlayerThread(ThreadGroup tg, String name) {
		super(tg, name);
	}

	@Override
	public void run() {
		for (int match = 1; match < 10; match++) {
			String msg = getName();
			msg += " -> played match #" + match;
			System.out.println(msg);
		}
	}

	public static void main(String[] args) {
		ThreadGroup team = new ThreadGroup("Team India");
		PlayerThread p1 = new PlayerThread(team, "Virat");
		PlayerThread p2 = new PlayerThread(team, "Rohit");
		p1.start();
		p2.start();

		System.out.println("Thread Group Info");
		System.out.println("Name:" + team.getName());
  
        //Number of active threads in the group
		System.out.println("Active Threads" + team.activeCount());

		// Number of active sub groups in the group
		System.out.println("Active Subgroups" + team.activeGroupCount());
	}

}
