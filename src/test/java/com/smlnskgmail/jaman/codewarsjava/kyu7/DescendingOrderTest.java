package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DescendingOrderTest {

    @Test
    public void test1() {
        assertEquals(
                0,
                new DescendingOrder(0).solution()
        );
    }

    @Test
    public void test2() {
        assertEquals(
                51,
                new DescendingOrder(15).solution()
        );
    }


    @Test
    public void test3() {
        assertEquals(
                987654321,
                new DescendingOrder(123456789).solution()
        );
    }

}
