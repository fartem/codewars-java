package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveFirstAndLastCharacterTest {

    @Test
    public void testRemoval() {
        assertEquals(
                "loquen",
                new RemoveFirstAndLastCharacter("eloquent").solution()
        );
        assertEquals(
                "ountr",
                new RemoveFirstAndLastCharacter("country").solution()
        );
        assertEquals(
                "erso",
                new RemoveFirstAndLastCharacter("person").solution()
        );
        assertEquals(
                "lac",
                new RemoveFirstAndLastCharacter("place").solution()
        );
    }

}
