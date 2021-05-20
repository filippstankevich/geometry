package com.epam.geometry;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import com.epam.geometry.data.DataException;
import com.epam.geometry.data.DataReader;
import com.epam.geometry.logic.CircleLogic;
import com.epam.geometry.model.Circle;
import com.epam.geometry.model.Point;
import static org.mockito.Mockito.when;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Matchers.anyDouble;
public class DirectorTest {
	
	@Test
	public void processTest() throws DataException {
		
		DataReader dataReader = Mockito.mock(DataReader.class);
		when(dataReader.readLines(anyString())).thenReturn(Arrays.asList("5.0 6.0 7.0", "4x 5.0 9.0"));
		
		StringValidator stringValidator = Mockito.mock(StringValidator.class);
		when(stringValidator.validate("5.0 6.0 7.0")).thenReturn(true);
		when(stringValidator.validate("4x 5.0 9.0")).thenReturn(false);
		
		CircleCreator circleCreator = Mockito.mock(CircleCreator.class);
		when(circleCreator.createCircle(anyListOf(Double.class))).thenReturn(new Circle(5.0, new Point(6.0, 7.0)));
		
		Director director = new Director(dataReader, stringValidator, circleCreator);
		
		CircleLogic circleLogic = Mockito.mock(CircleLogic.class); 
		when(circleLogic.checkIsCircle(anyDouble())).thenReturn(true);
		director.setCircleLogic(circleLogic);
		
		DataParser dataParser = Mockito.mock(DataParser.class);
		when(dataParser.parseData(anyString())).thenReturn(Arrays.asList(5.0, 6.0, 7.0));
		director.setDataParser(dataParser);		
		
		List<Circle> actualresult = director.process("");	
		Assert.assertNotNull(actualresult);
		Assert.assertTrue(actualresult.size() == 1);
		Assert.assertTrue(actualresult.get(0).getRadius() == 5.0);
	}
}
