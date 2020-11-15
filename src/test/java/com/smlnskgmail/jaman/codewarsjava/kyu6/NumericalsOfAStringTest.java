package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumericalsOfAStringTest {

    @Test
    public void basicTest1() {
        assertEquals(
                "1112111121311",
                new NumericalsOfAString("Hello, World!").solution()
        );
    }

    @Test
    public void basicTest2() {
        assertEquals(
                "11121111213112111131224132411122",
                new NumericalsOfAString("Hello, World! It's me, JomoPipi!").solution()
        );
    }

    @Test
    public void basicTest3() {
        assertEquals(
                "11121122342",
                new NumericalsOfAString("hello hello").solution()
        );
    }

}