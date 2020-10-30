package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class StringyStringsTest {

    @Test
    public void startTest() {
        assertEquals(
                "Your string should start with a 1",
                '1',
                new StringyStrings(3).solution().charAt(0)
        );
    }

    @Test
    public void lengthTests() {
        Random randGen = new Random();
        for (int i = 0; i < 10; i++) {
            int size = randGen.nextInt(50);
            assertEquals(
                    "Wrong length using size " + size,
                    size,
                    new StringyStrings(size).solution().length()
            );
        }
    }

}
