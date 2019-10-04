package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import codeWars.StrongNumber;

public class StrongNumberTest {

    private static String STRONG = "STRONG!!!!";
    private static String NOT_STRONG = "Not Strong !!";

    @Test
    public void testSomething() {
        assertEquals(STRONG, StrongNumber.isStrongNumber(1));
        assertEquals(STRONG, StrongNumber.isStrongNumber(2));
        assertEquals(STRONG, StrongNumber.isStrongNumber(145));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(7));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(93));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(185));
    }
    
    @Test
    public void testSomethingOtherSolution() {
        assertEquals(STRONG, StrongNumber.isStrongNumberOtherSolution(1));
        assertEquals(STRONG, StrongNumber.isStrongNumberOtherSolution(2));
        assertEquals(STRONG, StrongNumber.isStrongNumberOtherSolution(145));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumberOtherSolution(7));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumberOtherSolution(93));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumberOtherSolution(185));
    }

}
