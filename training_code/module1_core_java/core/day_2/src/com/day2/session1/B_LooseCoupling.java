package com.day2.session1;
//A passanger named raj moving from LN to Gurugram using metro
//Abs: focus on essential things ADT

//class Vehical as abstraction
//abs vs interface : 2 ways to achive abstraction
//abstract class Vehical{
//	public  abstract void move(String s, String d);
//}
interface Vehical{
	public  abstract void move(String s, String d);
}
class Metro implements Vehical{
	public void move(String s, String d) {
		System.out.println("moving from "+ s +" d "+ " using metro");
	}
}
class Car  implements Vehical{
	public void move(String s, String d) {
		System.out.println("moving from "+ s +" d "+ " using Car");
	}
}
class Bike  implements Vehical{
	public void move(String s, String d) {
		System.out.println("moving from "+ s +" d "+ " on bike");
	}
}
class Passanger{
	private String name;

	public Passanger(String name) {
		this.name = name;
	}
	public void travel(String s, String d, Vehical vehical) {
		System.out.println("name of passanger: "+ this.name);
		vehical.move(s, d);
	}
}
public class B_LooseCoupling {
	
	public static void main(String[] args) {
//		Vehical vehical=new Vehical();
//		vehical.move("LN", "Noida");
		//Metro metro=new Metro();
		Vehical vehical=new Bike();
		Passanger passanger=new Passanger("raj");
		passanger.travel("LN", "Noida", vehical);
	}

}




