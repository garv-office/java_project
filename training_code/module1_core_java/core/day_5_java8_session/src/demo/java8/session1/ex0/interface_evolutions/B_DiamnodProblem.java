package demo.java8.session1.ex0.interface_evolutions;

interface A {
	default void foo() {
		System.out.println("foo of interface A");
	}
}

interface B {
	default void foo() {
		System.out.println("foo of interface B");
	}
}

class C implements A, B {

	@Override
	public void foo() {
		A.super.foo();
		B.super.foo();
	}

}

public class B_DiamnodProblem {

	public static void main(String[] args) {

	}
}