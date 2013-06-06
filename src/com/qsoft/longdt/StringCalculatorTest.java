package com.qsoft.longdt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void shourlReturn0InEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}

	@Test
	public void shouldReturnNumberInOneNumberString() {
		assertEquals(1, StringCalculator.add("1"));
	}

	@Test
	public void shouldReturnSumOnTwoNumberWithComma() {
		assertEquals(3, StringCalculator.add("1,2"));
	}
}
