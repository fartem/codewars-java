package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbbreviateATwoWordNameTest {

    @Test
    public void testFixed() {
        assertEquals(
                "S.H",
                new AbbreviateATwoWordName("Sam Harris").solution()
        );
        assertEquals(
                "P.F",
                new AbbreviateATwoWordName("Patrick Feenan").solution()
        );
        assertEquals(
                "E.C",
                new AbbreviateATwoWordName("Evan Cole").solution()
        );
        assertEquals(
                "P.F",
                new AbbreviateATwoWordName("P Favuzzi").solution()
        );
        assertEquals(
                "D.M",
                new AbbreviateATwoWordName("David Mendieta").solution()
        );
    }

}
