package com.day2.session1;
//
class Foo{
//	void foo(Object o) {
//		System.out.println("void foo(Object o)");
//	}
//	void foo(String o) {
//		System.out.println("void foo(String o)");
//	}
}
class Cal{
	public long add(Integer a, Integer b) {
		System.out.println("public long add(Integer a, Integer b)");
		return a+b;
	}
	public long add(int ...a) {
		System.out.println("public long add(int ...a))");
		int sum=0;
		for(int temp: a) {
			sum+=temp;
		}
		return sum;
	}
//	public long add(long a, int b) {
//		return a+b;
//	}
}
public class D_Overloading {
	
	public static void main(String[] args) {
		Cal cal=new Cal();
		System.out.println(cal.add(2,6));
	}

}