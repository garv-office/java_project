package com.threads.session1.classical_threads;

//Creating thread with extends Thread class
//InterruptedException IllegalMonitorStateException

class MyJob implements Runnable {
	@Override
	public void run() {
		System.out.println("job started: "
					+ Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		System.out.println("job finished: "
				+ Thread.currentThread().getName());
	}

}

public class B_UsingRunnable {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main  started by the thread: " + Thread.currentThread().getName());
		MyJob job=new MyJob();
		Thread t1=new Thread(job, "A");
		Thread t2=new Thread(job, "B");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("main  end by the thread: " + Thread.currentThread().getName());

	}
}
