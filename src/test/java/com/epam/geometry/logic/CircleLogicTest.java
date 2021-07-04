package com.epam.geometry.logic;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import com.epam.geometry.model.Circle;
import com.epam.geometry.model.Point;

public class CircleLogicTest {
	@Test
	public void testCheckIsCircleShouldCheckWhenValidData() {
		//given(pre-conditions)
		CircleLogic circlelogic = new CircleLogic();
		//when
		Boolean actualResult = circlelogic.checkIsCircle(1.2);
		//then(post-conditions)
		Assert.assertTrue("Expected true", actualResult);
	}
	
	@Test
	public void testCheckIsCircleShouldCheckWhenInvalidData() {
		//given(pre-conditions)
		CircleLogic circlelogic = new CircleLogic();
		//when
		Boolean actualResult = circlelogic.checkIsCircle(0.0);
		//then(post-conditions)
		Assert.assertFalse("Expected false", actualResult); 
	}
	
	@Test
	public void testCheckIsCircleDoCheckWhenDataIsNegative() {
		//given(pre-conditions)
		CircleLogic circlelogic = new CircleLogic();
		//when
		Boolean actualResult = circlelogic.checkIsCircle(-2.6);
		//then(post-conditions)
		Assert.assertFalse("Expected false", actualResult); 
	}
	
	@Test
	public void testCheckCircleShouldCrossOneCoordinateAxesWhenDataIsPositive() {
		//given(pre-conditions)
		CircleLogic circlelogic = new CircleLogic();
		//when
		Boolean actualResult = circlelogic.crossOneCoordinateAxes(3.0, 4.0, 2.0);
		//then(post-conditions)
		Assert.assertTrue("Expected true", actualResult);
	}
	
	@Test
	public void testCheckCircleShouldCrossCrossTwoAxesWhenDataIsNegative() {
		//given(pre-conditions)
		CircleLogic circlelogic = new CircleLogic();
		//when
		Boolean actualResult = circlelogic.crossOneCoordinateAxes(7.0, 4.0, 2.0);
		//then(post-conditions)
		Assert.assertFalse("Expected false", actualResult);
	}
	
	@Test
	public void testCheckCircleShouldCrossOneCoordinateAxesWhenNegativeCrossZeroAxes() {
		//given(pre-conditions)
		CircleLogic circlelogic = new CircleLogic();
		//when
		Boolean actualResult = circlelogic.crossOneCoordinateAxes(1.0, 4.0, 2.0);
		//then(post-conditions)
		Assert.assertFalse("Expected false", actualResult);
	}
	
	@Test
	public void testCalculateCircleAreaShouldCalculateAreaWhenDataValid() {
		//given(pre-conditions)
		CircleLogic circlelogic = new CircleLogic();
		Point point = new Point(2.0, 3.0);
		Circle circle = new Circle(7.0, point);
		//when
		double actualResult = circlelogic.calculateCircleArea(circle);
		//then(post-conditions)
		double expectedResult =153.86;
		Assert.assertEquals(expectedResult, actualResult, expectedResult);
	}
	
	@Test
	public void testCalculateCirclePerimeterShouldCalculatePerimeterWhenDataValid() {
		//given(pre-conditions)
		CircleLogic circlelogic = new CircleLogic();
		Point point = new Point(2.0, 3.0);
		Circle circle = new Circle(7.0, point);
		//when
		double actualResult = circlelogic.calculateCirclePerimeter(circle);
		//then(post-conditions)
		double expectedResult = 43.96;
		Assert.assertEquals(expectedResult, actualResult, expectedResult);
	}
}



