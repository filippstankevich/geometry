package com.epam.geometry;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataParser {
	private static Logger logger = LogManager.getLogger();
	 
	public List<Double> parseData(String line){
	    		    	
	    	String[] strNumbers = line.split(" ");
	    	List<Double> dataArray = new ArrayList<>();
	    	dataArray.add(Double.parseDouble(strNumbers[0]));
	    	dataArray.add(Double.parseDouble(strNumbers[1]));
	    	dataArray.add(Double.parseDouble(strNumbers[2]));
	    	logger.info("# List<Double> equal #" + dataArray.toString());
	    	
	    	return dataArray;
	    }

}
