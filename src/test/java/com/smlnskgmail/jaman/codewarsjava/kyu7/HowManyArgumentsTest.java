package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class HowManyArgumentsTest {

    @Test
    public void sampleTest() {
        assertEquals(
                3,
                new HowManyArguments(1, 2, 3).solution()
        );
        assertEquals(
                3,
                new HowManyArguments(1, 2, "uhsaf uas").solution()
        );
        assertEquals(
                1,
                new HowManyArguments(1).solution()
        );
        assertEquals(
                4,
                new HowManyArguments('a', 865, "asfhgajsf", new BigInteger("123456")).solution()
        );
        assertEquals(
                0,
                new HowManyArguments().solution()
        );
    }

}
