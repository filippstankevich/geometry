package com.epam.geometry.logic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.epam.geometry.model.Circle;

public class CircleLogic {
	private static Logger LOGGER = LogManager.getLogger();

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
		LOGGER.info("# Calculate circle area #");
		return (Math.PI * Math.pow(circle.getRadius(), 2));
	}

	public double calculateCirclePerimeter(Circle circle) {
		LOGGER.info("# Cacculate circle perimeter #");
		return 2 * Math.PI * circle.getRadius();
	}
}
