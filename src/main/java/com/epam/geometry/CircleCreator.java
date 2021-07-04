package com.epam.geometry;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.epam.geometry.model.Circle;
import com.epam.geometry.model.Point;

public class CircleCreator {
	private static final Logger LOGGER = LogManager.getLogger();

	public Circle createCircle(List<Double> data){

		double radius = data.get(0);
		double x = data.get(1);
		double y = data.get(2); 

		Point center = new Point(x, y);

		LOGGER.info("# object created #");

		return new Circle(radius, center);
	}
}
