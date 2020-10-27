package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OverflowingWithLongingTest {

    @Test
    public void test00() {
        assertEquals(
                0,
                new OverflowingWithLonging(0, 0).solution()
        );
    }

    @Test
    public void test2345() {
        assertEquals(
                1035,
                new OverflowingWithLonging(23, 45).solution()
        );
    }

    @Test
    public void test3456() {
        assertEquals(
                -1904,
                new OverflowingWithLonging(-34, 56).solution()
        );
    }

    @Test
    public void testMin() {
        assertEquals(
                Long.MIN_VALUE,
                new OverflowingWithLonging(-2147483648L, 4294967296L).solution()
        );
    }

    @Test
    public void testMax() {
        assertEquals(
                Long.MAX_VALUE,
                new OverflowingWithLonging(2323823089L, 3969050863L).solution()
        );
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowMax() {
        new OverflowingWithLonging(Long.MAX_VALUE, Long.MAX_VALUE).solution();
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowMin() {
        new OverflowingWithLonging(Long.MIN_VALUE, Long.MIN_VALUE).solution();
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowMaxMin() {
        new OverflowingWithLonging(Long.MAX_VALUE, Long.MIN_VALUE).solution();
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflow1() {
        new OverflowingWithLonging(119537721L, 77158673929L).solution(); // -> Long.MAX_VALUE + 2
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflow2() {
        new OverflowingWithLonging(-2761311370L, 3340214413L).solution(); // -> Long.MIN_VALUE - 2
    }

}
