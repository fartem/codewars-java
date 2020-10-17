package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FakeBinaryTest {

    @Test
    public void test() {
        assertEquals(
                "101010",
                new FakeBinary("545454").solution()
        );
    }

}
