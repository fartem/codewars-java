package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TotalAmountOfPointsTest {

    @Test
    public void basicTests() {
        assertEquals(
                30,
                new TotalAmountOfPoints(
                        new String[] { "1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3" }
                ).result()
        );
        assertEquals(
                10,
                new TotalAmountOfPoints(
                        new String[] { "1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4" }
                ).result()
        );
        assertEquals(
                0,
                new TotalAmountOfPoints(
                        new String[] { "0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4" }
                ).result()
        );
        assertEquals(
                15,
                new TotalAmountOfPoints(
                        new String[] { "1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4" }
                ).result()
        );
        assertEquals(
                12,
                new TotalAmountOfPoints(
                        new String[] { "1:0", "2:0", "3:0", "4:4", "2:2", "3:3", "1:4", "2:3", "2:4", "3:4" }
                ).result()
        );
    }

}
