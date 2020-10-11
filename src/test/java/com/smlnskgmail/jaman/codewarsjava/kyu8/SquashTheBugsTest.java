package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquashTheBugsTest {

    @Test
    public void basicTests() {
        assertEquals(
                7,
                new SquashTheBugs("The quick white fox jumped around the massive dog").solution()
        );
        assertEquals(
                10,
                new SquashTheBugs("Take me to tinseltown with you").solution()
        );
        assertEquals(
                7,
                new SquashTheBugs("Sausage chops").solution()
        );
        assertEquals(
                6,
                new SquashTheBugs("Wind your body and wiggle your belly").solution()
        );
        assertEquals(
                7,
                new SquashTheBugs("Lets all go on holiday").solution()
        );
    }

}
