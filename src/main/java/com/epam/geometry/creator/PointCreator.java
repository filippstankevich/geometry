package com.epam.geometry.creator;


import com.epam.geometry.model.Point;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class PointCreator implements Creator<Point> {
    private static final Logger logger = LogManager.getLogger(PointCreator.class);

    @Override
    public Point create(String line){

        String [] coordinates = line.split(";");
        if (coordinates.length != 2){
            logger.error("incorrect values for point creation: " + line);
            throw new IllegalArgumentException("incorrect values for point creation: " + line);
        }
        float x = Float.parseFloat(coordinates[0]);
        float y = Float.parseFloat(coordinates[1]);
        logger.info("Creating new point with values x = " + x + " y = " + y);
        return new Point(x,y);
    }
}
