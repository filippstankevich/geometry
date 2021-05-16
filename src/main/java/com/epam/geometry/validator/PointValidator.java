package com.epam.geometry.validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PointValidator implements Validator {
    private static final Logger logger = LogManager.getLogger(PointValidator.class);

    @Override
    public boolean validate(String line) {

        String [] coordinates = line.split(";");
        if (coordinates.length != 2){
            logger.info("invalid values: " + line);
            return false;
        }
        logger.info("Valid values: " + line);
        return true;
    }
}
