package com.day4.session1.b.pending_topics_inner;
//how to make lambda from ann inner class
@FunctionalInterface
interface Cal{
	int add(int a, int b) ;
}
public class E_Lambda {
	
	public static void main(String[] args) {
//		Cal cal=( a,  b) ->a+b;
//		System.out.println(cal.add(2, 1));
		myCal(( a,  b) ->a+b);
	}

	private static void myCal(Cal cal) {
		System.out.println(cal.add(2, 1));
	}

}