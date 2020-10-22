package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertStringToCamelCaseTest {

    @Test
    public void testSomeUnderscoreLowerStart() {
        assertEquals(
                "theStealthWarrior",
                new ConvertStringToCamelCase("the_Stealth_Warrior").solution()
        );
    }

    @Test
    public void testSomeDashLowerStart() {
        assertEquals(
                "theStealthWarrior",
                new ConvertStringToCamelCase("the-Stealth-Warrior").solution()
        );
    }

}
