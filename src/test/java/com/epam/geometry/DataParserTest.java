package com.epam.geometry;

import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataParserTest {
	
	@Test
	public void testParseDataShouldParseDataNotNull() {
		//given(pre-conditions)
		String line = "7.0 8.0 9.0";
		DataParser dataParser = new DataParser();
		//when
		List<Double> actualResult = dataParser.parseData(line);
		//then(post-conditions)
		Assert.assertNotNull(actualResult);
	}

	@Test
	public void testParseDataShouldParseDataWithPositiveNumbers() {
		//given(pre-conditions)
		String line = "7.0 8.0 9.0";
		DataParser dataParser = new DataParser();
		//when
		List<Double> actualResult = dataParser.parseData(line);
		//then(post-conditions)
		Assert.assertEquals(7.0, actualResult.get(0), 7.0);
	}

	@Test
	public void testParseDataShouldParseDataWithPositivNumbers() {
		//given(pre-conditions)
		String line = "7.0 8.0 9.0";
		DataParser dataParser = new DataParser();
		//when
		List<Double> actualResult = dataParser.parseData(line);
		//then(post-conditions)
		Assert.assertEquals(8.0, actualResult.get(1), 8.0);
	}

	@Test
	public void testParseDataShouldParseDataWhenPositiveNumber() {
		//given(pre-conditions)
		String line = "7.0 8.0 9.0";
		DataParser dataParser = new DataParser();
		//when
		List<Double> actualResult = dataParser.parseData(line);
		//then(post-conditions)
		Assert.assertEquals(9.0, actualResult.get(2), 9.0);
	}

	@Test
	public void parseDataNegativeTest() {
		//given(pre-conditions)
		String line = "";
		DataParser dataParser = new DataParser();
		//when //then(post-conditions)
		Assertions.assertThrows(NumberFormatException.class, () ->{
			List<Double> actualResult = dataParser.parseData(line);
		});
	}
}


