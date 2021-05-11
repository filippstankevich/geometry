package com.epam.geometry;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.epam.geometry.model.Circle;

public class CircleCreator {
	private static Logger logger = LogManager.getLogger();

	public Circle createCircle(List<Double> data){

		double radius = data.get(0);
		double x = data.get(1);
		double y = data.get(2); 

		Circle circle = new Circle(radius, x, y);
		logger.info("# object created #" + circle.toString());
		
		return circle;
	}


}
