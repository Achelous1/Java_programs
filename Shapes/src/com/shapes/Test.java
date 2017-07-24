package com.shapes;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle(5, new Point(1,2));
		Shape rectangle = new Rectangle(2, 4, new Point(0, 1));
		Shape square = new Rectangle(4, 4, new Point());
		
		System.out.println(circle.calcArea());
		System.out.println(rectangle.calcArea());
		System.out.println(square.calcArea());
		System.out.println(((Rectangle)rectangle).isSquare());
		System.out.println(((Rectangle)square).isSquare());
	}

}