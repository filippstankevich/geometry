package com.epam.geometry;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StringValidatorTest {
	
	@Test
	public void validatePositiveTest() {
		String line = "5.0 6.0 7.0";
		StringValidator stringValidator = new StringValidator();
		Boolean actualResult = stringValidator.validate(line);
		Assert.assertTrue("Expect true", actualResult);
	}
	
	@Test
	public void validateNegativeTest() {
		String line = "5x 6.0 7.0";
		StringValidator stringValidator = new StringValidator();
		Boolean actualResult = stringValidator.validate(line);
		Assert.assertFalse("Expect false", actualResult);
	}
	
	@Test
	public void validatedNegativeTest() {
		String line = "5.0  6.0 7.0";
		StringValidator stringValidator = new StringValidator();
		Boolean actualResult = stringValidator.validate(line);
		Assert.assertFalse("Expect false", actualResult);
	}
}
