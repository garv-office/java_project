package com.day2.session1;

class Rectangle {
	private int l, b;

	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getArea() {
		return l * b;
	}
}
//class Square extends Rectangle{
//
//	public Square(int l) {
//		super(l, l);
//	}
//	
//}
class Square{
	private Rectangle rectangle;

	public Square(int l) {
		rectangle=new Rectangle(l, l);
	}
	
	public void changeDimension(int newValue) {
		rectangle.setL(newValue);
		rectangle.setB(newValue);
	}
	public double getArea() {
		return rectangle.getArea();
	}
}
public class J_Sq_Rect_Problem {

	public static void main(String[] args) {
		Square square=new Square(2);
	
		System.out.println(square.getArea());
		square.changeDimension(3);

		System.out.println(square.getArea());
		
	}
}
