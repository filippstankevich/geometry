package com.epam.geometry;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import com.epam.geometry.data.DataException;
import com.epam.geometry.data.DataReader;
import com.epam.geometry.model.Circle;

public class DirectorTest {
	
	@Test
	public void processTest() throws DataException {
		
		DataReader dataReader = Mockito.mock(DataReader.class);
		Mockito.when(dataReader.readLines(anyString()).thenReturn(List<String>("5.0 6.0 7.0", "7x 2.0 6.0")));
		
		CircleCreator circleCreator = Mockito.mock(CircleCreator.class);
		
		
		StringValidator stringValidator = Mockito.mock(StringValidator.class);
		
		Director director = new Director(dataReader, stringValidator, circleCreator);
		List<Circle> result = director.process("");	
	}
}
