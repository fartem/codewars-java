package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicVariableAssignmentTest {

    @Test
    public void basicTest() {
        assertEquals(
                "code",
                BasicVariableAssignment.a
        );
        assertEquals(
                "wa.rs",
                BasicVariableAssignment.b
        );
        assertEquals(
                BasicVariableAssignment.name,
                BasicVariableAssignment.a + BasicVariableAssignment.b
        );
    }

}
