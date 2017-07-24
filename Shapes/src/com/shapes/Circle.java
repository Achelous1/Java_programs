package com.shapes;


public class Circle extends Shape {
	double r;
	
	Circle() {
		this(1.0, new Point());
	}
	
	Circle(double r, Point p){
		super(p);
		this.r = r;
	}

	@Override
	double calcArea() {
		// TODO Auto-generated method stub
		double area = Math.PI * Math.pow(r, 2);
		return area;
	}
	
}
