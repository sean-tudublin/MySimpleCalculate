package com.example.mysimplecalculate;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import androidx.test.filters.SmallTest;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
@SmallTest
public class ExampleUnitTest {
    private Calculator myCalculator;

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("in beforeClass");

    }

    @Before
    public void setUp() throws Exception {
        myCalculator = new Calculator();
        System.out.println("in setup");

    }
    /**
     * Test for simple addition
     */
    @Test
    public void addTwoNumbers() {
        double resultAdd = myCalculator.add(1.1d, 1d);
        assertEquals(resultAdd, 2.1d, 0.0002);
    }
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void addTwoNumbers() {
        double resultAdd = myCalculator.add(1d, 1d);
        //assertThat(resultAdd, is(equalTo(2d)));
        assertEquals(resultAdd, 2.1d, 0.0002);
    }

    @Test
    public void addTwoNumbersNegative() {
        double resultAdd = myCalculator.add(-1d, 2d);
        //assertThat(resultAdd, is(equalTo(1d)));
        assertEquals(resultAdd, 2.1d, 0.0002);
    }

    @Test
    public void addTwoNumbersFloats() {
        double resultAdd = myCalculator.add(1.111f, 1.111d);
        //assertThat(resultAdd, is(closeTo(2.222, 0.01)));
        assertEquals(resultAdd, 2.1d, 0.0002);
    }

    @Test
    public void subTwoNumbers() {
        double resultSub = myCalculator.sub(1d, 1d);
        //assertThat(resultSub, is(equalTo(0d)));
        assertEquals(resultAdd, 2.1d, 0.0002);
    }

    @Test
    public void subWorksWithNegativeResult() {
        double resultSub = myCalculator.sub(1d, 17d);
        //assertThat(resultSub, is(equalTo(-16d)));
        assertEquals(resultAdd, 2.1d, 0.0002);
    }

    @Test
    public void mulTwoNumbers() {
        double resultMul = myCalculator.mul(32d, 2d);
        //assertThat(resultMul, is(equalTo(64d)));
        assertEquals(resultAdd, 2.1d, 0.0002);
    }

    @Test
    public void divTwoNumbers() {
        double resultDiv = myCalculator.div(32d,2d);
        //assertThat(resultDiv, is(equalTo(16d)));
        assertEquals(resultAdd, 2.1d, 0.0002);
    }

    @Test
    public void divTwoNumbersZero() {
        double resultDiv = myCalculator.div(32d,0);
        //assertThat(resultDiv, is(equalTo(Double.POSITIVE_INFINITY)));
        assertEquals(resultAdd, 2.1d, 0.0002);
    }

}