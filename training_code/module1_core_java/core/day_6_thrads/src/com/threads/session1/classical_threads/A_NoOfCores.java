package com.threads.session1.classical_threads;

public class A_NoOfCores {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getThreadGroup());
	}
}
