package com.epam.geometry.logic;
import com.epam.geometry.model.Point;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointLogicTest {
    @Test
    public void testGetQuarter(){
        Point point1 = new Point(3.4f,6.8f);
        int resultTest1 = PointLogic.getQuarter(point1);
        assertTrue(1 == resultTest1);

        Point point2 = new Point(-3.4f,6.8f);
        int resultTest2 = PointLogic.getQuarter(point2);
        assertTrue(2 == resultTest2);

        Point point3 = new Point(-3.4f,-6.8f);
        int resultTest3 = PointLogic.getQuarter(point3);
        assertTrue(3 == resultTest3);

        Point point4 = new Point(3.4f,-6.8f);
        int resultTest4 = PointLogic.getQuarter(point4);
        assertTrue(4 == resultTest4);

        Point point5 = new Point(0.0f,0.0f);
        int resultTest5 = PointLogic.getQuarter(point5);
        assertTrue(0 == resultTest5);

    }


}
