package com.q11;

public class ThreadTest implements Runnable {
	static int i;

	public void run() {
		System.out.print("running...");
	}

	public static void main(String[] args) {
		Thread t = new Thread(new ThreadTest());
		t.start();
		try {
			t.join(0);
		} catch (InterruptedException e) {
		}
		System.out.print("exit");
	}
}