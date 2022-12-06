package com.tutoring.abstractinterfaces;

public class Rectangle extends GeometricObject{

	
	
	public Rectangle(double Length, double width) {
		this.sideA = Length;
		this.sideB = width;
	}
	
	
	
	
	@Override
	public int compareTo(GeometricObject o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return sideA* sideB;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * (sideA + sideB);
	}

}
