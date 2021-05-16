package com.epam.geometry.model;

import javassist.NotFoundException;
import org.junit.Assert;
import org.junit.Test;
import pl.pojo.tester.api.assertion.Assertions;

import static pl.pojo.tester.api.assertion.Method.*;

public class CircleTest {
    @Test
    public  void circleTest(){
            Class<?> applicationException = Circle.class;

            Assertions.assertPojoMethodsFor(applicationException).testing(GETTER,SETTER,EQUALS,HASH_CODE,TO_STRING).quickly().areWellImplemented();

    }
    @Test
    public void constructorTest(){
        Circle testCircle = new Circle(3.9f,4.8f,9);
        Assert.assertNotNull(testCircle);
    }

    @Test
    public void constructorNegativeRadiusTest(){
        Circle testCircle = null;
        try{
            testCircle = new Circle(3.9f,4.8f,-9);
            Assert.fail();
        }
        catch (Exception e){
            Assert.assertTrue(e instanceof IllegalArgumentException);
        }
        Assert.assertNull(testCircle);
    }
}
