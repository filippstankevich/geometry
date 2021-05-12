package com.epam.geometry.data;


import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataReaderTest {
	
	@Test
	public void readLinesTest() throws DataException {
		DataReader reader  = new DataReader();
		List<String> actualResult = reader.readLines("resources.txt");
		Assert.assertNotNull(actualResult);
		Assert.assertTrue(actualResult.size() == 15);
	}
	
	@Test
	public void readLinesNegativeTest() {
		DataReader reader  = new DataReader();
		Assertions.assertThrows(NullPointerException.class, () -> {
			List<String> actualResult = reader.readLines("kon.txt");
		});
	}
}
