package com.epam.geometry.logic;

import com.epam.geometry.model.Circle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CircleLogic {

    private static final Logger logger = LogManager.getLogger(CircleLogic.class);
    public static double getPerimeter(Circle circle){
        double perimeter = 2 * Math.PI * circle.getRadius();

        logger.info("Circle " + circle + " has perimeter: " + perimeter);
        return perimeter;

    }

    public static double getSquare(Circle circle){
        double square = Math.PI * circle.getRadius() * circle.getRadius();

        logger.info("Circle " + circle + " has square: " + square);
        return square;

    }

}
