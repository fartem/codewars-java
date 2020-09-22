package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class HowManyArgumentsTest {

    @Test
    public void sampleTest() {
        assertEquals(
                3,
                new HowManyArguments(1, 2, 3).result()
        );
        assertEquals(
                3,
                new HowManyArguments(1, 2, "uhsaf uas").result()
        );
        assertEquals(
                1,
                new HowManyArguments(1).result()
        );
        assertEquals(
                4,
                new HowManyArguments('a', 865, "asfhgajsf", new BigInteger("123456")).result()
        );
        assertEquals(
                0,
                new HowManyArguments().result()
        );
    }

}
