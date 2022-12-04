package com.tutoring.abstractinterfaces;
/**
 * Defines our GeometricObject abstract super class which implements Comparable interface
 * @author AlexJenkins
 *
 */
public abstract class GeometricObject implements Comparable<GeometricObject> {
	
	
	
	protected double sideA;
	protected double sideB;
	protected double sideC;
	
	protected String color;
	protected boolean isFilled;
	
	
	
	public abstract double calculateArea(); 
	public abstract double calculatePerimeter(); 

	
	/**
	 * Compares two geometric type objects by there area calculation
	 * @param GeomtericObject Type object
	 * @param GeomtericObject Type object2
	 * @return
	 */
	public static int max(GeometricObject object, GeometricObject object2) {
		if(object.calculateArea() == object2.calculateArea()) {
			System.out.println("Objects are equal");
			return 0;
		}else if(object.calculateArea()> object2.calculateArea()){
			System.out.println("object A is the max");
			return 1;
		}else {
			System.out.println("Object B is the max");
			return -1;
		}
	}
	
	
	public double getSideA() {
		return sideA;
	}
	public void setSideA(int sideA) {
		this.sideA = sideA;
	}
	public double getSideB() {
		return sideB;
	}
	public void setSideB(int sideB) {
		this.sideB = sideB;
	}
	public double getSideC() {
		return sideC;
	}
	public void setSideC(int sideC) {
		this.sideC = sideC;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return isFilled;
	}
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	
	
	
	
	

}
