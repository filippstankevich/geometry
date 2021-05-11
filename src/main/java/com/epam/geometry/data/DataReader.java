package com.epam.geometry.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataReader {   
	private static Logger logger = LogManager.getLogger();

	public List<String> readLines(String filename) throws DataException {
		
		InputStream in = this.getClass().getResourceAsStream("/" + filename);
		
		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) 
		{
			String line;
			List<String> linesArray = new ArrayList<>();
			while((line = bufferedReader.readLine()) != null) {
				logger.debug("# line read #" + line);
				linesArray.add(line);
			}
			return linesArray;
		}catch(IOException e) {
			logger.error(e.getMessage(), e);
			throw new DataException(e.getMessage(), e.getCause());
		}
	}
}

