package com.day3.session2.q1;


class AEx extends Exception{
}

class BEx extends AEx{}

class A{
	void foo()throws AEx{
		System.out.println("I");
	}
}
class B extends A{
	void foo()throws BEx, NullPointerException, ArithmeticException{
		System.out.println("II");
	}
}
public class A_Ex_And_Overriding {
	
	public static void main(String[] args) {
		A a=new B();
		try {
			a.foo();
		} catch (AEx e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
