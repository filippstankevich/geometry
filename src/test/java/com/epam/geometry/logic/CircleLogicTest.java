package com.epam.geometry.logic;

import com.epam.geometry.model.Circle;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleLogicTest {

    @Test
    public void testGetPerimeter(){
        Circle testCircle = new Circle(4.7f,6.8f,7);
        double testResult = CircleLogic.getPerimeter(testCircle);
        System.out.println(testResult);
        assertTrue(testResult == 43.982297150257104);

    }

    @Test
    public void testGetSquare(){
        Circle testCircle = new Circle(4.7f,6.8f,7);
        double testResult = CircleLogic.getSquare(testCircle);
        System.out.println(testResult);
        assertTrue(testResult == 153.93804002589985);

    }
}
