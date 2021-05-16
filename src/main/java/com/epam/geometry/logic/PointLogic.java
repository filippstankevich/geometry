package com.epam.geometry.logic;

import com.epam.geometry.model.Point;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PointLogic {
    private static final Logger logger = LogManager.getLogger(PointLogic.class);
    /**
    define to witch quarter the point belongs
     returns 1,2,3 or 4. Return 0 if point is on any of axises
    */
    public static int getQuarter(Point point){


        if (point.getX() > 0 && point.getY() > 0){
            logger.info("Point " + point + " is located in: 1 quarter");
            return 1;
        }
        if (point.getX() < 0 && point.getY() > 0){
            logger.info("Point " + point + " is located in: 2 quarter");
            return 2;
        }
        if (point.getX() < 0 && point.getY() < 0){
            logger.info("Point " + point + " is located in: 3 quarter");
            return 3;
        }
        if (point.getX() > 0 && point.getY() < 0){
            logger.info("Point " + point + " is located in: 4 quarter");
            return 4;
        }
        logger.info("Point " + point + " is located in coordinate axis");
        return 0;

    }
}
