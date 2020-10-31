package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoZerosForHerosTest {

    @Test
    public void test1() {
        assertEquals(
                new NoZerosForHeros(1450).solution(),
                145
        );
        assertEquals(
                new NoZerosForHeros(960000).solution(),
                96
        );
        assertEquals(
                new NoZerosForHeros(1050).solution(),
                105
        );
        assertEquals(
                new NoZerosForHeros(-1050).solution(),
                -105
        );
    }

}
