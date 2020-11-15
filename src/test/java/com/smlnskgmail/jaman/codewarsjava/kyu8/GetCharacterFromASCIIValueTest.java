package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetCharacterFromASCIIValueTest {

    @Test
    public void testChar() {
        assertEquals(
                '7',
                new GetCharacterFromASCIIValue(55).solution()
        );
        assertEquals(
                '8',
                new GetCharacterFromASCIIValue(56).solution()
        );
        assertEquals(
                '9',
                new GetCharacterFromASCIIValue(57).solution()
        );
        assertEquals(
                ':',
                new GetCharacterFromASCIIValue(58).solution()
        );
        assertEquals(
                ';',
                new GetCharacterFromASCIIValue(59).solution()
        );
        assertEquals(
                '<',
                new GetCharacterFromASCIIValue(60).solution()
        );
        assertEquals(
                '=',
                new GetCharacterFromASCIIValue(61).solution()
        );
        assertEquals(
                '>',
                new GetCharacterFromASCIIValue(62).solution()
        );
        assertEquals(
                '?',
                new GetCharacterFromASCIIValue(63).solution()
        );
        assertEquals(
                '@',
                new GetCharacterFromASCIIValue(64).solution()
        );
        assertEquals(
                'A',
                new GetCharacterFromASCIIValue(65).solution()
        );
        assertEquals(
                "getChar should return a `char`",
                0,
                Character.compare(
                        '!',
                        new GetCharacterFromASCIIValue(33).solution()
                )
        );
    }

}
