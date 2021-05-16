package com.epam.geometry;

import com.epam.geometry.creator.CircleCreator;
import com.epam.geometry.creator.Creator;
import com.epam.geometry.creator.PointCreator;
import com.epam.geometry.data.DataReader;
import com.epam.geometry.logic.CircleLogic;
import com.epam.geometry.logic.PointLogic;
import com.epam.geometry.model.Circle;
import com.epam.geometry.model.Point;
import com.epam.geometry.validator.CircleValidator;
import com.epam.geometry.validator.PointValidator;
import com.epam.geometry.validator.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.List;


public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Validator pointValidator = new PointValidator();
        Creator pointCreator = new PointCreator();
        DataReader reader = new DataReader();

        Validator circleValidator = new CircleValidator();
        Creator circleCreator = new CircleCreator();

        Director<Point> pointDirector = new Director(reader,pointValidator,pointCreator);
        Director<Circle> circleDirector = new Director<>(reader,circleValidator,circleCreator);


        List<Point> points = pointDirector.process("data.txt");
        List<Circle> circles = circleDirector.process("data.txt");

        logger.info("Amount of points: "+ points.size());

        for (Point p: points) {
            int quarter = PointLogic.getQuarter(p);
            if (quarter == 0){
                logger.info("Point " + p + "is located in coordinate axis");
            }
            else{
                logger.info("Point " + p + " is located in: " + quarter + " quarter");
            }
        }

            logger.info("Amount of circles: " + circles.size());

        for (Circle c:circles) {
            double circlePerimeter = CircleLogic.getPerimeter(c);
            double circleSquare = CircleLogic.getSquare(c);
            logger.info("Circle " + c + " has perimeter " + circlePerimeter);
            logger.info("Circle " + c + " has square " + circleSquare);
        }


    }
}
