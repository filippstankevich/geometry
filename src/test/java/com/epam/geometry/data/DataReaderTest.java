package com.epam.geometry.data;

import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataReaderTest {

	@Test
	public void testReadLinesShouldReadLineFromFile() throws DataException {
		//given(pre-conditions)
		DataReader reader  = new DataReader();
		//when
		List<String> actualResult = reader.readLines("resources.txt");
		//then(post-conditions)
		Assert.assertNotNull(actualResult);
	}

	@Test
	public void testReadLinesShouldReadLineFromRightFile() throws DataException {
		//given(pre-conditions)
		DataReader reader  = new DataReader();
		//when
		List<String> actualResult = reader.readLines("resources.txt");
		//then(post-conditions)
		Assert.assertTrue(actualResult.size() == 15);
	}

	@Test
	public void readLinesNegativeTest() {
		//given(pre-conditions)
		DataReader reader  = new DataReader();
		//when
		Assertions.assertThrows(NullPointerException.class, () -> {
			List<String> actualResult = reader.readLines("kon.txt");
		});
	}
}
