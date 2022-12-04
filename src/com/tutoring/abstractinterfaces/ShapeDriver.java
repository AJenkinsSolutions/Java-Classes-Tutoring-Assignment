package com.tutoring.abstractinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Abstract classes and interfaces
 * @author alexJenkins
 * @course Java Full Stack Development 
 * @section Core-Java
 * @instructor Ms.Lewis
 * @date 12/03/22
 */
public class ShapeDriver {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//1.
		Scanner inputScanner = new Scanner(System.in);
		
		int a,b,c;
		String color;
		boolean isfilled;
		
		System.out.println("Plese enter length of side A");
		a = inputScanner.nextInt();
		System.out.println("Plese enter length of side B");
		b = inputScanner.nextInt();
		System.out.println("Plese enter length of side C");
		c = inputScanner.nextInt();
		System.out.println("Please enter a color for triangle");
		
		inputScanner.nextLine();
		color = inputScanner.nextLine();
		System.out.println("Is the triangle filled true or false");
		isfilled = inputScanner.nextBoolean();
		

		
		Triangle obj1 = new Triangle(a, b, c, color, isfilled);
		
		System.out.printf("The area of this triangle is %.3f\n", obj1.calculateArea());
		System.out.printf("The perimeter of this triangle is %.0f\n", obj1.calculatePerimeter());
		System.out.printf("Triangle color %s.\n", obj1.getColor());
		System.out.printf("Is triangle filled is %s.\n", obj1.isFilled());

		
		
		//2.
		ArrayList<Number> y = new ArrayList<>();
		y.add(1);
		y.add(2);
		y.add(77);
		y.add(82);
		y.add(12);
		Triangle.sort(y);
		System.out.println();
		//3
		Triangle obj2 = new Triangle(6, 6, 6, "Green", true);
		System.out.println("GeometricObect Max method results: " + GeometricObject.max(obj1, obj2));
	}

}
