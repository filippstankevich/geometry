package com.epam.geometry.logic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.epam.geometry.model.Circle;

public class CircleLogic {
	private static Logger logger = LogManager.getLogger();
	
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
	
	public double calculateCircleArea(Circle circle) {
		double result =  (Math.PI * Math.pow(circle.getRadius(), 2));
		logger.info("# Circle area is #" + result);
		return result;
	}
	
	public double calculateCirclePerimeter(Circle circle) {
		double result = 2 * Math.PI * circle.getRadius();
		logger.info("# Circle perimeter is #" + result);
		return result;
	}
	
}
