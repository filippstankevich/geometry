package com.epam.geometry.validator;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointValidatorTest {
    @Test
    public void testValidate(){
        PointValidator testValidator = new PointValidator();

        assertTrue(true == testValidator.validate("2.3;4.5"));
        assertTrue(false == testValidator.validate("2.34.5"));
        assertTrue(false == testValidator.validate("2.3;4.5;6.56"));
    }
}
