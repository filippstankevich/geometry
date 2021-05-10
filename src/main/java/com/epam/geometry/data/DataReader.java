package com.epam.geometry.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DataReader {   

	//TODO: implement this method using BufferedReader, do not throw original IOException, wrap it with your own
	public List<String> readLines(String filename) throws DataException {
		
		
		InputStream in = this.getClass().getResourceAsStream("/" + filename);
		
		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) 
		{
			String line;
			List<String> linesArray = new ArrayList<>();
			while((line = bufferedReader.readLine()) != null) {
				linesArray.add(line);
			}
			return linesArray;
		}catch(IOException e) {
			throw new DataException(e.getMessage(), e.getCause());
		}
	}

	
}

