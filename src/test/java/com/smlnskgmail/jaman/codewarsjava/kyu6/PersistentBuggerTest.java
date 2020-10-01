package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersistentBuggerTest {

    @Test
    public void BasicTests() {
        assertEquals(
                3,
                new PersistentBugger(39).solution()
        );
        assertEquals(
                0,
                new PersistentBugger(4).solution()
        );
        assertEquals(
                2,
                new PersistentBugger(25).solution()
        );
        assertEquals(
                4,
                new PersistentBugger(999).solution()
        );
    }

}
