package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OverflowingWithJoyTest {

    @Test
    public void test00() {
        assertEquals(
                0,
                new OverflowingWithJoy(0, 0).solution()
        );
    }

    @Test
    public void test2345() {
        assertEquals(
                1035,
                new OverflowingWithJoy(23, 45).solution()
        );
    }

    @Test
    public void test3456() {
        assertEquals(
                -1904,
                new OverflowingWithJoy(-34, 56).solution()
        );
    }

    @Test
    public void testMin() {
        assertEquals(
                Integer.MIN_VALUE,
                new OverflowingWithJoy(-32768, 65536).solution()
        );
    }

    @Test
    public void testMax() {
        assertEquals(
                Integer.MAX_VALUE - 1,
                new OverflowingWithJoy(42966, 49981).solution()
        );
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowMax() {
        new OverflowingWithJoy(
                Integer.MAX_VALUE,
                Integer.MAX_VALUE
        ).solution();
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowMin() {
        new OverflowingWithJoy(
                Integer.MIN_VALUE,
                Integer.MIN_VALUE
        ).solution();
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowMaxMin() {
        new OverflowingWithJoy(
                Integer.MAX_VALUE,
                Integer.MIN_VALUE
        ).solution();
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflow1() {
        new OverflowingWithJoy(39650, 54161).solution();
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflow2() {
        new OverflowingWithJoy(42967, 49981).solution();
    }

}
