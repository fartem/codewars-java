package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareNSumTest {

    @Test
    public void testBasic() {
        assertEquals(
                9,
                new SquareNSum(new int[]{1, 2, 2}).solution()
        );
        assertEquals(
                5,
                new SquareNSum(new int[]{1, 2}).solution()
        );
        assertEquals(
                50,
                new SquareNSum(new int[]{5, -3, 4}).solution()
        );
    }

}
