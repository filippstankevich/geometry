package com.epam.geometry;

import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataParserTest {
	
	@Test
	public void parseDataPositivTest() {
		String line = "7.0 8.0 9.0";
		DataParser dataParser = new DataParser();
		List<Double> actualResult = dataParser.parseData(line);
		Assert.assertNotNull(actualResult);
		Assert.assertEquals(7.0, actualResult.get(0), 7.0);
		Assert.assertEquals(8.0, actualResult.get(1), 8.0);
		Assert.assertEquals(9.0, actualResult.get(2), 9.0);
	}
	
	@Test
	public void parseDataNegativeTest() {
		String line = "";
		DataParser dataParser = new DataParser();
		//List<Double> actualResult = dataParser.parseData(line);
		Assertions.assertThrows(NumberFormatException.class, () ->{
			List<Double> actualResult = dataParser.parseData(line);
			});
	}
}


