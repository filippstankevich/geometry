package com.epam.geometry.validator;


import com.epam.geometry.data.DataReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CircleValidator implements Validator {
    private static final Logger logger = LogManager.getLogger(CircleValidator.class);
    @Override
    public boolean validate(String line) {

        String [] coordinates = line.split(";");
        if (coordinates.length != 3){
            logger.info("Incorrect values: " + line);
            return false;
        }
        float r = Float.parseFloat(coordinates[2]);
        if (r < 0){
            logger.info("Radius couldn't negative: " + line);
            return false;
        }
        logger.info("Valid circle: " + line);
        return true;
    }

}
