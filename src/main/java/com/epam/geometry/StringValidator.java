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
    
    public static void main(String[] args) {
    	StringValidator val = new StringValidator();
    	//String a = "1.0 -0.9 -0.9";
    	String d = "5.0 -9.0 4.0";
    	Boolean yes = val.validate(d);
    	System.out.println(yes);
    }
    
}
