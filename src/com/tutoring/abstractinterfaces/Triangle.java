package com.tutoring.abstractinterfaces;

import java.util.ArrayList;
/**
 * Simple triangle class which extends GeometricObject
 * implemented Methods: calculateArea, calculate Parameter, compareTo
 * @author AlexJenkins
 *
 */
public class Triangle extends GeometricObject{

	
	public Triangle(double a, double b, double c, String color, boolean filled) {
		this.sideA = a;
		this.sideB = b;
		this.sideC = c;
		this.color = color;
		this.isFilled = filled;
	}

	@Override
	public String toString() {
		return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + ", color=" + color + ", isFilled="
				+ isFilled + "]";
	}

	@Override
	public double calculateArea() {
		
		double s = (this.sideA + this.sideB + this.sideC) /2;
		
		double aCal= (s- this.sideA);
		double bCal = (s- this.sideB);
		double cCal = (s- this.sideC);
		
		double area = Math.sqrt(s * (aCal * bCal * cCal));
		return area;
	}

	@Override
	public double calculatePerimeter() {		
		return this.sideA + this.sideB + this.sideC;
	}
	
	
	public static void sort(ArrayList<Number> list) {
		list.sort(null);
	
	}

	
	@Override
	public int compareTo(GeometricObject o) {
		
		if(this.calculateArea() == o.calculateArea()) {
			return 0;
		}else if(this.calculateArea()> o.calculateArea()){
			return 1;
		}else {
			return -1;
		}
		
	}

	
	
	
	
	
	

	
	

	
	
	
	
	
}
