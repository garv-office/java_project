package com.day4.session1.b.pending_topics_inner;

class Outer {
	private int i = 10;

	class Inner {

		void foo() {
			  i = 20;
			System.out.println("foo method ..."+Outer.this.i);
		}
	}

//	 void bar() {
//		Inner inner = new Inner();
//		inner.foo();
//	}
}

public class B_InnerClasses {

	public static void main(String[] args) {
		Outer o= new Outer();
		Outer.Inner in=o.new Inner();
		
//			Outer outer=new Outer();
//			outer.bar();
	}

}