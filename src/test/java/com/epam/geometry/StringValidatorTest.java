package com.epam.geometry;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StringValidatorTest {
	
	@Test
	public void validatePositiveTest() {
		//given(pre-conditions)
		String line = "5.0 6.0 7.0";
		StringValidator stringValidator = new StringValidator();
		//when
		Boolean actualResult = stringValidator.validate(line);
		//then(post-conditions)
		Assert.assertTrue("Expect true", actualResult);
	}
	
	@Test
	public void validateNegativeTest() {
		//given(pre-conditions)
		String line = "5x 6.0 7.0";
		StringValidator stringValidator = new StringValidator();
		//when
		Boolean actualResult = stringValidator.validate(line);
		//then(post-conditions)
		Assert.assertFalse("Expect false", actualResult);
	}
	
	@Test
	public void validatedNegativeTest() {
		//given(pre-conditions)
		String line = "5.0  6.0 7.0";
		StringValidator stringValidator = new StringValidator();
		//when
		Boolean actualResult = stringValidator.validate(line);
		//then(post-conditions)
		Assert.assertFalse("Expect false", actualResult);
	}
}
