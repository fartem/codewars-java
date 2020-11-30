package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertAStringToANumberTest {

    @Test
    public void test1() {
        assertEquals(
                1234,
                new ConvertAStringToANumber("1234").solution()
        );
    }

    @Test
    public void test2() {
        assertEquals(
                605,
                new ConvertAStringToANumber("605").solution()
        );
    }

    @Test
    public void test3() {
        assertEquals(
                1405,
                new ConvertAStringToANumber("1405").solution()
        );
    }

    @Test
    public void test4() {
        assertEquals(
                -7,
                new ConvertAStringToANumber("-7").solution()
        );
    }

}
