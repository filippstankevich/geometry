package com.epam.geometry;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import com.epam.geometry.model.Circle;

public class CircleCreatorTest {
	
	@Test
	public void createCircleTest() {
		//given(pre-conditions)
		List<Double> data = new ArrayList<>();
		data.add(5.0);
		data.add(-9.0);
		data.add(4.0);	
		CircleCreator circleCreator = new CircleCreator();
		//when
		Circle actualResult = circleCreator.createCircle(data);
		//then(post-conditions)
		Assert.assertNotNull(actualResult);
		Assert.assertEquals(5.0, actualResult.getRadius(), 5.0);
		Assert.assertEquals(-9.0, actualResult.getCenter().getX(), -9.0);
		Assert.assertEquals(4.0, actualResult.getCenter().getY(), 4.0);
	}
}



