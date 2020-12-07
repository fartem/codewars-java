package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DashatizeItTest {

    @Test
    public void testBasic() {
        assertEquals(
                "2-7-4",
                new DashatizeIt(274).solution()
        );
        assertEquals(
                "5-3-1-1",
                new DashatizeIt(5311).solution()
        );
        assertEquals(
                "86-3-20",
                new DashatizeIt(86320).solution()
        );
        assertEquals(
                "9-7-4-3-02",
                new DashatizeIt(974302).solution()
        );
    }

    @Test
    public void testWeird() {
        assertEquals(
                "0",
                new DashatizeIt(0).solution()
        );
        assertEquals(
                "1",
                new DashatizeIt(-1).solution()
        );
        assertEquals(
                "28-3-6-9",
                new DashatizeIt(-28369).solution()
        );
    }

    @Test
    public void testEdgeCases() {
        assertEquals(
                "2-1-4-7-48-3-64-7",
                new DashatizeIt(Integer.MAX_VALUE).solution()
        );
        assertEquals(
                "2-1-4-7-48-3-648",
                new DashatizeIt(Integer.MIN_VALUE).solution()
        );
        assertEquals(
                "1-1-1-1-1-1-1-1-1-1",
                new DashatizeIt(-1111111111).solution()
        );
    }

}
