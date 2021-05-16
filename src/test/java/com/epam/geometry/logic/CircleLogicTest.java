package com.epam.geometry.logic;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.epam.geometry.model.Circle;
import com.epam.geometry.model.Point;

public class CircleLogicTest {
	
	@Test
	public void checkIsCircleTest() {
		//given(pre-conditions)
		CircleLogic circlelogic = new CircleLogic();
		//when
		Boolean actualResult = circlelogic.checkIsCircle(1.2);
		//then(post-conditions)
		Assert.assertTrue("Expected true", actualResult);
	}
	
	@Test
	public void checkIsCircleNegativeTest() {
		//given(pre-conditions)
		CircleLogic circlelogic = new CircleLogic();
		//when
		Boolean actualResult = circlelogic.checkIsCircle(0.0);
		//then(post-conditions)
		Assert.assertFalse("Expected false", actualResult); 
	}
	
	@Test
	public void checkIsCircleNegativeWithNegativeNumberTest() {
		//given(pre-conditions)
		CircleLogic circlelogic = new CircleLogic();
		//when
		Boolean actualResult = circlelogic.checkIsCircle(-2.6);
		//then(post-conditions)
		Assert.assertFalse("Expected false", actualResult); 
	}
	
	@Test
	public void crossOneCoordinateAxesPositiveTest() {
		//given(pre-conditions)
		CircleLogic circlelogic = new CircleLogic();
		//when
		Boolean actualResult = circlelogic.crossOneCoordinateAxes(3.0, 4.0, 2.0);
		//then(post-conditions)
		Assert.assertTrue("Expected true", actualResult);
	}
	
	@Test
	public void crossOneCoordinateAxesNegativeCrossTwoAxesTest() {
		//given(pre-conditions)
		CircleLogic circlelogic = new CircleLogic();
		//when
		Boolean actualResult = circlelogic.crossOneCoordinateAxes(7.0, 4.0, 2.0);
		//then(post-conditions)
		Assert.assertFalse("Expected false", actualResult);
	}
	
	@Test
	public void crossOneCoordinateAxesNegativeCrossZeroAxesTest() {
		//given(pre-conditions)
		CircleLogic circlelogic = new CircleLogic();
		//when
		Boolean actualResult = circlelogic.crossOneCoordinateAxes(1.0, 4.0, 2.0);
		//then(post-conditions)
		Assert.assertFalse("Expected false", actualResult);
	}
	
	@Test
	public void calculateCircleAreaTest() {
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
	public void calculateCirclePerimeterTest() {
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



