package com.epam.geometry;

import com.epam.geometry.logic.CircleLogic;
import com.epam.geometry.model.Circle;

public class CircleCreator {

    public Circle createCircle(String line){
    	//boolean isCircle = false;
    	Circle circle = null;
    	String[] strNumbers = line.split(" ");
    	
    	double radius = Double.parseDouble(strNumbers[0]);
    	double x = Double.parseDouble(strNumbers[1]);
    	double y = Double.parseDouble(strNumbers[2]);
    	CircleLogic circleLogic = new CircleLogic();
    	if(circleLogic.checkIsCircle(radius)) {
    		circle = new Circle(radius, x, y);
    	}   	

    	return circle;
    }
}
