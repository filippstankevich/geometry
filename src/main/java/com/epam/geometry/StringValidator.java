package com.epam.geometry;

public class StringValidator {
 
	final String STRING_PATTERN = "[0-9]+\\.[0-9]+\\s-?[0-9]+\\.[0-9]+\\s-?[0-9]+\\.[0-9]";  
	
    public boolean validate(String line) {
    	boolean validLine = false;
    	if (line.matches(STRING_PATTERN)) {
    		validLine = true;
    	}
    	return validLine;
    }
    
}
