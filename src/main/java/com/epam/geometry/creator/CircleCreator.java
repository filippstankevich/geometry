package com.epam.geometry.creator;

import com.epam.geometry.model.Circle;
import com.epam.geometry.validator.PointValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CircleCreator implements Creator<Circle> {
    private static final Logger logger = LogManager.getLogger(CircleCreator.class);

    @Override
    public Circle create(String line){

        String [] circleParameters = line.split(";");
        if (circleParameters.length != 3){
            logger.error("incorrect values for point creation: " + line);
            throw new IllegalArgumentException("incorrect values for point creation: " + line);
        }
        float x = Float.parseFloat(circleParameters[0]);
        float y = Float.parseFloat(circleParameters[1]);
        float r = Float.parseFloat(circleParameters[2]);
        logger.info("Creating new circle with values x = " + x + " y = " + y + "radius = " + r);
        return new Circle(x,y,r);
    }
}
