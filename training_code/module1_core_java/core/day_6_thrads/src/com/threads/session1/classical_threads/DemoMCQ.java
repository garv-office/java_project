package com.threads.session1.classical_threads;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.Thread.UncaughtExceptionHandler;

//Creating thread with extends Thread class
//InterruptedException IllegalMonitorStateException
class MyExWrapper extends RuntimeException{
	public MyExWrapper(Throwable cause) {
		super(cause);
	}
}
class MyJob1 implements Runnable {
	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("foo.txt"));
		} catch (FileNotFoundException e) {
			throw new MyExWrapper(e);
		}
	}

}
class CommonExHandler implements UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("I am common ,ex happends "+ t.getName()+": "+ e.toString());
	}
	
}

class MyExHandler implements UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("ex happends "+ t.getName()+": "+ e.toString());
	}
	
}
public class DemoMCQ {
	public static void main(String[] args) {
		
			Thread.setDefaultUncaughtExceptionHandler(new CommonExHandler());
			MyJob1 j=new MyJob1();
			Thread t=new Thread(j, "A");
			//t.setUncaughtExceptionHandler(new MyExHandler());
			t.start();
		
	}

}
