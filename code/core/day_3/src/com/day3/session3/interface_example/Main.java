package com.day3.session3.interface_example;

public class Main {
	
	public static void main(String[] args) {
//		StackImplRavi s=new StackImplRavi();
		
		Stack s=new StackImplRavi();
		
		doWorkOnStack(s);
	}

	private static void doWorkOnStack(Stack s) {
		s.push(3);
		s.push(30);
		s.push(13);
		System.out.println("pop....");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		
	}

}