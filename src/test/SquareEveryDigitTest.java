package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import codeWars.SquareEveryDigit;

public class SquareEveryDigitTest {

	@Test
	public void test1() {
		int number = 9119;
		assertEquals(811181, SquareEveryDigit.squareEveryDigit(number));
	}

	@Test
	public void test2() {
		int number = 9999;
		assertEquals(81818181, SquareEveryDigit.squareEveryDigit(number));
	}

	@Test
	public void test3() {
		int number = 0;
		assertEquals(0, SquareEveryDigit.squareEveryDigit(number));
	}
	
	@Test
	public void test4() {
		int number = -15;
		assertEquals(125, SquareEveryDigit.squareEveryDigit(number));
	}
}
