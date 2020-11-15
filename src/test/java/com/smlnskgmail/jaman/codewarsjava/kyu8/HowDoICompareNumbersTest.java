package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HowDoICompareNumbersTest {

    private static final Object[][] tests = {
            {0, "nothing"},
            {123, "nothing"},
            {-1, "nothing"},
            {42, "everything"},
            {42 * 42, "everything squared"},
    };

    @Test
    public void test() throws Exception {
        for (Object[] test : tests) {
            assertEquals(
                    test[1],
                    new HowDoICompareNumbers((Integer) test[0]).solution()
            );
        }
    }

}
