package com.smlnskgmail.jaman.codewarsjava.kyu5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Int32ToIPv4Test {

    @Test
    public void sampleTest() {
        assertEquals(
                "128.114.17.104",
                new Int32ToIPv4(2154959208L).result()
        );
        assertEquals(
                "0.0.0.0",
                new Int32ToIPv4(0).result()
        );
        assertEquals(
                "128.32.10.1",
                new Int32ToIPv4(2149583361L).result()
        );
    }

}
