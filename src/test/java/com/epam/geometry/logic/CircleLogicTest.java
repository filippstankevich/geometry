package com.epam.geometry.logic;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.epam.geometry.model.Circle;
import com.epam.geometry.model.Point;

public class CircleLogicTest {
	
	@Test
	public void checkIsCircleTest() {
		CircleLogic circlelogic = new CircleLogic();
		Boolean actualResult = circlelogic.checkIsCircle(1.2);
		Assert.assertTrue("Expected true", actualResult);
	}
	
	@Test
	public void checkIsCircleNegativeTest() {
		CircleLogic circlelogic = new CircleLogic();
		Boolean actualResult = circlelogic.checkIsCircle(0.0);
		Assert.assertFalse("Expected false", actualResult); 
	}
	
	@Test
	public void checkIsCircleNegativeWithNegativeNumberTest() {
		CircleLogic circlelogic = new CircleLogic();
		Boolean actualResult = circlelogic.checkIsCircle(-2.6);
		Assert.assertFalse("Expected false", actualResult); 
	}
	
	@Test
	public void crossOneCoordinateAxesPositiveTest() {
		CircleLogic circlelogic = new CircleLogic();
		Boolean actualResult = circlelogic.crossOneCoordinateAxes(3.0, 4.0, 2.0);
		Assert.assertTrue("Expected true", actualResult);
	}
	
	@Test
	public void crossOneCoordinateAxesNegativeCrossTwoAxesTest() {
		CircleLogic circlelogic = new CircleLogic();
		Boolean actualResult = circlelogic.crossOneCoordinateAxes(7.0, 4.0, 2.0);
		Assert.assertFalse("Expected false", actualResult);
	}
	
	@Test
	public void crossOneCoordinateAxesNegativeCrossZeroAxesTest() {
		CircleLogic circlelogic = new CircleLogic();
		Boolean actualResult = circlelogic.crossOneCoordinateAxes(1.0, 4.0, 2.0);
		Assert.assertFalse("Expected false", actualResult);
	}
	
	@Test
	public void calculateCircleAreaTest() {
		CircleLogic circlelogic = new CircleLogic();
		Point point = new Point(2.0, 3.0);
		Circle circle = new Circle(7.0, point);
		double actualResult = circlelogic.calculateCircleArea(circle);
		double expectedResult =153.86;
		Assert.assertEquals(expectedResult, actualResult, expectedResult);
	}
	
	@Test
	public void calculateCirclePerimeterTest() {
		CircleLogic circlelogic = new CircleLogic();
		Point point = new Point(2.0, 3.0);
		Circle circle = new Circle(7.0, point);
		double actualResult = circlelogic.calculateCirclePerimeter(circle);
		double expectedResult = 43.96;
		Assert.assertEquals(expectedResult, actualResult, expectedResult);
	}
}



