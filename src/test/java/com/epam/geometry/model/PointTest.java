package com.epam.geometry.model;

import org.junit.Test;
import pl.pojo.tester.api.assertion.Assertions;

import static pl.pojo.tester.api.assertion.Method.*;

public class PointTest {
    @Test
    public  void pointTest(){
        Class<?> applicationException = Point.class;

        Assertions.assertPojoMethodsFor(applicationException).testing(CONSTRUCTOR,GETTER,SETTER,EQUALS,HASH_CODE,TO_STRING).quickly().areWellImplemented();

    }
}
