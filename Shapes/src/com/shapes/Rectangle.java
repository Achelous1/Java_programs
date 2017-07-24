package com.shapes;

public class Rectangle extends Shape{
	double width;
	double height;	
	
	Rectangle(){
		this(1, 1, new Point());
	}
	
	Rectangle(double width, double height, Point p){
		super(p);
		this.width = width;
		this.height = height;
	}
	
	@Override
	double calcArea() {
		// TODO Auto-generated method stub
		double area = width * height;
		return area;
	}
	
	public boolean isSquare(){
		if(width == height && width*height != 0){
			return true;
		} else
			return false;
	}

}
