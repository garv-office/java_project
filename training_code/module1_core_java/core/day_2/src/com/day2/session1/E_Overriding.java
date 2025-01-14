package com.day2.session1;

abstract class Shape{
	private int a1, a2;
	private String color;

	public Shape(int a1, int a2, String color) {
		this.a1 = a1;
		this.a2 = a2;
		this.color=color;
	}
	public abstract double getArea() ;
	
	public String getColor() {
		return color;
	}
	public int getA1() {
		return a1;
	}
	public int getA2() {
		return a2;
	}
	
}
class Square2 extends Shape{

	public Square2(int a1,String color) {
		super(a1, a1, color);
	}

	@Override
	public double getArea() {
		return getA1() * getA1();
	}
}
class Triangle extends Shape{

	public Triangle(int a1,int a2, String color) {
		super(a1, a1, color);
	}

	@Override
	public double getArea() {
		return 0.5*getA1() * getA2();
	}
}

public class E_Overriding {
	
	public static void main(String[] args) {
		
		//Shape s=new Shape();
		
		Shape shape=new Triangle(2, 2, "red");
		System.out.println(shape.getArea());
	}

}



