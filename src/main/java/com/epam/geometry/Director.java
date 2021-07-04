package com.epam.geometry;

import com.epam.geometry.data.DataException;
import com.epam.geometry.data.DataReader;
import com.epam.geometry.logic.CircleLogic;
import com.epam.geometry.model.Circle;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Director {
	public static final String TEXT_DATA = "resources.txt";
	private static final Logger LOGGER = LogManager.getLogger();

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

	public List<Circle> process(String filename){

		List<Circle> circles = new ArrayList<>();
		List<Double> data = new ArrayList<>();
		try {
			List<String> lines = reader.readLines(filename);
			for(String line : lines) {
				if(validator.validate(line)) {
					data =dataParser.parseData(line);
					if(circleLogic.checkIsCircle(data.get(0))) {
						Circle circle = creator.createCircle(data);
						circles.add(circle);
					}
				}
			}
		} catch (DataException e) {
			LOGGER.info("# exception is occured #" + e.getMessage() + " " + e);
		}
		return circles;
	}
}
