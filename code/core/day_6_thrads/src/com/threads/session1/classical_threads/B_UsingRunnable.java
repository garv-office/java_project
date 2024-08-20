package com.threads.session1.classical_threads;

//Creating thread with extends Thread class
//InterruptedException IllegalMonitorStateException
class MyJob implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Name of thread: " +
					Thread.currentThread().getName());
	}

}

public class B_UsingRunnable {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("job  started by the thread: " + Thread.currentThread().getName());
		MyJob job = new MyJob();
		Thread thread1 = new Thread(job, "A");
		thread1.setPriority(Thread.MAX_PRIORITY-3);
		Thread thread2 = new Thread(job, "B");
		Thread thread3 = new Thread(job, "C");
		
		thread1.start();
		thread1.start();
		
		thread2.start();
		thread3.start();
		
		thread1.join(1000);
		thread2.join(1000);
		thread3.join(1000);
		
		
		System.out.println("job  end by the thread: " + Thread.currentThread().getName());

	}
}
