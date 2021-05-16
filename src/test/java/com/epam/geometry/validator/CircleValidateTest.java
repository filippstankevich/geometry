package com.epam.geometry.validator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleValidateTest {
    @Test
    public void testValidate(){
        CircleValidator testValidator = new CircleValidator();
        assertTrue(true == testValidator.validate("3.2;4.5;8"));
        assertTrue(false == testValidator.validate("3.2;4.5;-8"));
        assertTrue(false == testValidator.validate("3.2;4.5;7.9;8"));
    }
}
