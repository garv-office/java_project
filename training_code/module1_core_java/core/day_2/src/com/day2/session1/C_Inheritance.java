package com.day2.session1;
/*
 * type of inheritance
 * parameter passing with inheritance
 * why multiple inheritance is not allowd?
 */
class A{
	private int a;

	public A(int a) {
		this.a=a;
	}
	public void print() {
		System.out.println("a: "+ a);
	}
}
class B extends A{
	private int b;
	public B(int a, int b) {
		super(a);
		this.b=b;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("b: "+ b);
	}
	
}
class C extends B{
	private int c;
	public C(int a, int b, int c) {
		super(a,b);
		this.c=c;
	}
	public void print() {
		super.print();
		System.out.println("c: "+ c);
	}
}
public class C_Inheritance {
	
	public static void main(String[] args) {
		A a=new C(1,2,3);
		a.print();
	}
}
