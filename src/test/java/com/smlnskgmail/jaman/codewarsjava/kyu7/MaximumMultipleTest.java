package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumMultipleTest {

    @Test
    public void smallPositives() {
        test(
                "The largest multiple of 2 between 0 and 7 is 6.",
                6,
                new MaximumMultiple(2, 7).solution()
        );
        test(
                "The largest multiple of 3 between 0 and 10 is 9.",
                9,
                new MaximumMultiple(3, 10).solution()
        );
        test(
                "The largest multiple of 7 between 0 and 17 is 14.",
                14,
                new MaximumMultiple(7, 17).solution()
        );
    }

    @Test
    public void largerPositives() {
        test(
                "The largest multiple of 10 between 0 and 50 is 50.",
                50,
                new MaximumMultiple(10, 50).solution()
        );
        test(
                "The largest multiple of 37 between 0 and 200 is 185.",
                185,
                new MaximumMultiple(37, 200).solution()
        );
        test(
                "The largest multiple of 7 between 0 and 100 is 98.",
                98,
                new MaximumMultiple(7, 100).solution()
        );
    }

    private void test(
            String message,
            int expected,
            int actual
    ) {
        assertEquals(message, expected, actual);
    }

}
