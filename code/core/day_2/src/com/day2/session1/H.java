package com.day2.session1;
//bad use of inheritance
//SOLID: bad design
class FallSickEx extends RuntimeException{}
class DA{
	void shootAnyBody() {
		System.out.println("let me take AK47 and kill you");
	}
	void enjoyMoney() {
		System.out.println("lets enjoy..");
	}
}
//class SonOfDA extends DA{
//	void shootAnyBody() {
//		throw new FallSickEx();
//	}
//	void enjoyMoney() {
//		System.out.println("super lets enjoy..");
//	}
//}
class SonOfDA{
	private DA da=new DA();
	
	void enjoyMoney() {
		da.enjoyMoney();
	}
}
public class H {

	public static void main(String[] args) {
		SonOfDA da=new SonOfDA();
		da.enjoyMoney();
		//da.shootAnyBody();
	}
}



