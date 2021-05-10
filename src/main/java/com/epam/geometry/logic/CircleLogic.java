package com.epam.geometry.logic;

public class CircleLogic {
	
	public boolean checkIsCircle(double radius) {
		boolean result = true;
		if(radius <= 0) {
			result = false;
		}	
		return result;
	}
	
	public boolean crossOneCoordinateAxes(double radius, double x, double y) {
		int numberCrossAxes = 0;
		
		if(radius >= Math.abs(x)) {
			numberCrossAxes++;
		}
		if(radius >= Math.abs(y)) {
			numberCrossAxes++;
		}		
		return numberCrossAxes == 1;	
	}
	
	public double calculateCircleArea(double radius) {
		double result =  (Math.PI * Math.pow(radius, 2));
		return result;
	}
	
	public double calculateCirclePerimeter(double radius) {
		double result = 2 * Math.PI * radius;
		return result;
	}
	
}
