package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwapValuesTest {

    @Test
    public void testSomething() {
        Integer[] args = new Integer[]{1, 2};
        SwapValues swapValues = new SwapValues(args);
        swapValues.swapValues();
        assertEquals(
                2,
                swapValues.input[0]
        );
        assertEquals(
                1,
                swapValues.input[1]
        );
    }

}
