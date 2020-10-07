package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeonardoDicaprioAndOscarsTest {

    @Test
    public void oscar88() {
        assertEquals(
                "Leo finally won the oscar! Leo is happy",
                new LeonardoDicaprioAndOscars(88).solution()
        );
    }

    @Test
    public void oscar86() {
        assertEquals(
                "Not even for Wolf of wallstreet?!",
                new LeonardoDicaprioAndOscars(86).solution()
        );
    }

    @Test
    public void below88() {
        assertEquals(
                "When will you give Leo an Oscar?",
                new LeonardoDicaprioAndOscars(87).solution()
        );
        assertEquals(
                "When will you give Leo an Oscar?",
                new LeonardoDicaprioAndOscars(83).solution()
        );
        assertEquals(
                "When will you give Leo an Oscar?",
                new LeonardoDicaprioAndOscars(85).solution()
        );
    }

    @Test
    public void over88() {
        assertEquals(
                "Leo got one already!",
                new LeonardoDicaprioAndOscars(89).solution()
        );
        assertEquals(
                "Leo got one already!",
                new LeonardoDicaprioAndOscars(90).solution()
        );
        assertEquals(
                "Leo got one already!",
                new LeonardoDicaprioAndOscars(95).solution()
        );
    }

}
