package com.epam.geometry;

import com.epam.geometry.data.DataException;
import com.epam.geometry.data.DataReader;
import com.epam.geometry.logic.CircleLogic;
import com.epam.geometry.model.Circle;
import java.util.ArrayList;
import java.util.List;

public class Director {
	public static final String TEXT_DATA = "resources.txt";

    private final DataReader reader;
    private final StringValidator validator;
    private final CircleCreator creator;
    private CircleLogic circleLogic;
    private DataParser dataParser;

    public Director(DataReader reader, StringValidator validator, CircleCreator creator) {
    	this.reader = reader;
    	this.validator = validator;
    	this.creator = creator;
    }
    public void setCircleLogic(CircleLogic circleLogic) {
		this.circleLogic = circleLogic;
	}
    public void setDataParser(DataParser dataParser) {
		this.dataParser = dataParser;
	}
    
    public List<Circle> process(String filename) throws DataException{
    	List<String> lines = reader.readLines(filename);
		List<Circle> circles = new ArrayList<>();
		List<Double> data = new ArrayList<>();
		
		for(String line : lines) {
			if(validator.validate(line)) {
				data =dataParser.parseData(line);
				if(circleLogic.checkIsCircle(data.get(0))) {
					Circle circle = creator.createCircle(data);
					circles.add(circle);
				}
			}
		}
		return circles;
    }
}
