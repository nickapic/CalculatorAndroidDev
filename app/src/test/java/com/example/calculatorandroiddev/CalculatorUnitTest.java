package com.example.calculatorandroiddev;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CalculatorUnitTest {

    @Test
    public void addition_isCorrect() {
        final double givenInt1 = 5;
        final double givenInt2= 5;
        final int expectedResult= 10;
        final double actualResult = CalculatorBackEnd.addItems(givenInt1,givenInt2);
        assertEquals(expectedResult, actualResult, 0.01);
    }
    @Test
    public void subtraction_isCorrect() {
        final double givenInt1 = 5;
        final double givenInt2= 5;
        final int expectedResult= 0;
        final double actualResult = CalculatorBackEnd.subtractItems(givenInt1,givenInt2);
        assertEquals(expectedResult, actualResult, 0.01);
    }
    @Test
    public void multiplication_isCorrect() {
        final double givenInt1 = 5;
        final double givenInt2= 5;
        final int expectedResult= 25;
        final double actualResult = CalculatorBackEnd.multiplyItems(givenInt1,givenInt2);
        assertEquals(expectedResult, actualResult, 0.01);
    }
    @Test
    public void division_isCorrect() {
        final double givenInt1 = 5;
        final double givenInt2= 5;
        final int expectedResult= 1;
        final double actualResult = CalculatorBackEnd.divideItems(givenInt1,givenInt2);
        assertEquals(expectedResult, actualResult, 0.01);
    }
    @Test
    public void squareRoot_isCorrect() {
        final double givenInt1 = 25;
        final int expectedResult= 5;
        final double actualResult = CalculatorBackEnd.squareRootItems(givenInt1);
        assertEquals(expectedResult, actualResult, 0.01);
    }
}