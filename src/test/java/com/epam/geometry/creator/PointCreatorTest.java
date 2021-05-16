package com.epam.geometry.creator;

import com.epam.geometry.model.Point;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointCreatorTest {
    @Test
    public void testCreate(){
        PointCreator testCreator = new PointCreator();
        try {
            testCreator.create("2.3;4.8;7.9");
        }catch (Exception e){
            assertTrue(e instanceof IllegalArgumentException);
            assertEquals(e.getMessage(),"incorrect values for point creation: 2.3;4.8;7.9");

        }

        Point testPoint = testCreator.create("2.3;4.8");
        assertNotNull(testPoint);

        assertTrue(testPoint.getX() == 2.3f);
        assertTrue(testPoint.getY() == 4.8f);

    }
}
