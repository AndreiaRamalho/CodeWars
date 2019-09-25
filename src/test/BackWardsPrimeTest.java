package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import codeWars.BackWardsPrime;

public class BackWardsPrimeTest {

	@Test
	public void backWardsPrime_1_1() {
		assertEquals("13 17 31 37 71 73 79 97", BackWardsPrime.backwardsPrime(1, 100));
	}

	@Test
	public void backWardsPrimeOtherSolution_1_2() {
		assertEquals("13 17 31 37 71 73 79 97", BackWardsPrime.backwardsPrimeOtherSolution(1, 100));
	}

	@Test
	public void backWardsPrimeOtherSolution2_1_3() {
		assertEquals("13 17 31 37 71 73 79 97", BackWardsPrime.backwardsPrimeOtherSolution2(1, 100));
	}

	@Test
	public void backWardsPrime_2_1() {
		assertEquals("9923 9931 9941 9967", BackWardsPrime.backwardsPrime(9900, 10000));
	}

	@Test
	public void backWardsPrimeOtherSolution1_2_2() {
		assertEquals("9923 9931 9941 9967", BackWardsPrime.backwardsPrimeOtherSolution(9900, 10000));
	}

	@Test
	public void backWardsPrimeOtherSolution2_2_3() {
		assertEquals("9923 9931 9941 9967", BackWardsPrime.backwardsPrimeOtherSolution2(9900, 10000));
	}

	@Test
	public void backWardsPrime_3_1() {
		assertEquals("13 17 31 37 71 73 79 97", BackWardsPrime.backwardsPrime(1, 100));
	}

	@Test
	public void backWardsPrimeOtherSolution_3_2() {
		assertEquals("13 17 31 37 71 73 79 97", BackWardsPrime.backwardsPrimeOtherSolution(1, 100));
	}

	@Test
	public void backWardsPrimeOtherSolution2_3_3() {
		assertEquals("13 17 31 37 71 73 79 97", BackWardsPrime.backwardsPrimeOtherSolution2(1, 100));
	}

	@Test
	public void backWardsPrime_4_1() {
		assertEquals("", BackWardsPrime.backwardsPrime(501, 599));
	}

	@Test
	public void backWardsPrimeOtherSolution_4_2() {
		assertEquals("", BackWardsPrime.backwardsPrimeOtherSolution(501, 599));
	}

	@Test
	public void backWardsPrimeOtherSolution_4_3() {
		assertEquals("", BackWardsPrime.backwardsPrimeOtherSolution2(501, 599));
	}
}
