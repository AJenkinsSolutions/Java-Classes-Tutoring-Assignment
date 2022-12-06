package com.tutoring.abstractinterfaces;

public class Circle extends GeometricObject {

	

	double radius; 
	double diameter = radius * 2;
		
	public Circle(double radius, String color, boolean fiiled) {
		this.radius = radius;
		this.color = color;
		this.isFilled = fiiled;
	}
	
	@Override
	public int compareTo(GeometricObject o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateArea() {
		double area = super.pi * radius * radius;
		return area;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * super.pi * this.radius;
	}

}
