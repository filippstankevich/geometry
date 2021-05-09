package com.epam.geometry.logic;

public class CircleLogic {
	
	public double CircleArea(double radius) {
		if (radius <= 0) {
			System.out.println("This figure is point");
		}
		double result =  (Math.PI * Math.pow(radius, 2));
		return result;
	}
	
	public double CirclePerimeter(double radius) {
		if (radius <= 0) {
			System.out.println("This figure is point");
		}
		double result = 2 * Math.PI * radius;
		return result;
	}
	
}
