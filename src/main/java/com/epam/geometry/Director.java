package com.epam.geometry;

import com.epam.geometry.data.DataException;
import com.epam.geometry.data.DataReader;
import com.epam.geometry.model.Circle;
import java.util.ArrayList;
import java.util.List;

public class Director {
	public static final String TEXT_DATA = "resources.txt";

    private final DataReader reader;
    private final StringValidator validator;
    private final CircleCreator creator;

    public Director(DataReader reader, StringValidator validator, CircleCreator creator) {
    	this.reader = reader;
    	this.validator = validator;
    	this.creator = creator;
    }
    
    public List<Circle> process(String filename) throws DataException{
    	List<String> lines = reader.readLines(filename);
		List<Circle> circles = new ArrayList<Circle>();
	
		for(String line : lines) {
			if(validator.validate(line)) {
				Circle circle = creator.createCircle(line);
				if(circle != null) {
					circles.add(circle);	
				}
			}
		}
		return circles;
    }
    
    /*public static void main(String[] args) throws DataException {
    	Director dir = new Director(new DataReader(), new StringValidator(), new CircleCreator());
    	List<Circle> circles = dir.process(TEXT_DATA);
    	
    	for(Circle e: circles) {
    		System.out.println(e);
    	}
    	
    }*/
}
