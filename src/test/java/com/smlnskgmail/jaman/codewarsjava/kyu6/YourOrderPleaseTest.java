package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YourOrderPleaseTest {

    @Test
    public void test1() {
        assertEquals(
                "Thi1s is2 3a T4est",
                new YourOrderPlease("is2 Thi1s T4est 3a").solution()
        );
    }

    @Test
    public void test2() {
        assertEquals(
                "Fo1r the2 g3ood 4of th5e pe6ople",
                new YourOrderPlease("4of Fo1r pe6ople g3ood th5e the2").solution()
        );
    }

    @Test
    public void test3() {
        assertEquals(
                "Empty input should return empty string",
                "",
                new YourOrderPlease("").solution()
        );
    }

}
