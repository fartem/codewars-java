package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgeRangeCompatibilityEquationTest {

    @Test
    public void exampleTests() {
        assertEquals(
                "15-20",
                new AgeRangeCompatibilityEquation(17).solution()
        );
        assertEquals(
                "27-66",
                new AgeRangeCompatibilityEquation(40).solution()
        );
        assertEquals(
                "14-16",
                new AgeRangeCompatibilityEquation(15).solution()
        );
        assertEquals(
                "24-56",
                new AgeRangeCompatibilityEquation(35).solution()
        );
        assertEquals(
                "9-11",
                new AgeRangeCompatibilityEquation(10).solution()
        );
    }

}
