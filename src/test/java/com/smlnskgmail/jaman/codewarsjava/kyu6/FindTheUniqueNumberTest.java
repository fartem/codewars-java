package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheUniqueNumberTest {

    @Test
    public void sampleTestCases() {
        assertEquals(
                1.0,
                new FindTheUniqueNumber(new double[] { 0, 1, 0 }).solution(),
                0.0000000000001
        );
        assertEquals(
                2.0,
                new FindTheUniqueNumber(new double[] { 1, 1, 1, 2, 1, 1 }).solution(),
                0.0000000000001
        );
    }

}
