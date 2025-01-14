package com.day2.session1;
//Singleton design patterns
//Head first design patter
 class Singleton{
	 private static Singleton singleton=new Singleton();
	 
	private Singleton() {
		System.out.println("it is a private ctr dare to call me");
	}
	public static Singleton getSingleton() {
		return singleton;
	}
}
public class K_PrivateCtr {
	
	public static void main(String[] args) {
		Singleton singleton=Singleton.getSingleton();
		System.out.println(singleton.hashCode());
		
		Singleton singleton2=Singleton.getSingleton();
		System.out.println(singleton2.hashCode());
	}

}
