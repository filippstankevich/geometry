package com.epam.geometry.creator;

import com.epam.geometry.model.Circle;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleCreatorTest {
    @Test
    public void testCreator(){
        CircleCreator testCreate = new CircleCreator();
        try{
            testCreate.create("3.7;6.7;7;9");
        }catch (Exception e){
            assertTrue(e instanceof IllegalArgumentException);
            assertEquals(e.getMessage(),"incorrect values for point creation: 3.7;6.7;7;9");
        }
        Circle testCircle = testCreate.create("3.7;6.7;7");
        assertNotNull(testCircle);
        assertTrue(testCircle.getRadius() == 7f);
        assertTrue(testCircle.getCentre().getX() == 3.7f);
        assertTrue(testCircle.getCentre().getY() == 6.7f);

    }
}
