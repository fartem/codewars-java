package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LunarMathematicsAdditionTest {

    @Test
    public void testLunarMathAddGetsCorrectAnswerSimpleTests() {
        assertEquals(
                "4+ 5 ",
                5,
                new LunarMathematicsAddition(4, 5).solution()
        );
        assertEquals(
                "5 + 5",
                5,
                new LunarMathematicsAddition(5, 5).solution()
        );
        assertEquals(
                "6 + 3",
                6,
                new LunarMathematicsAddition(6, 3).solution()
        );
        assertEquals(
                "5 + 0",
                5,
                new LunarMathematicsAddition(5, 0).solution()
        );
    }

    @Test
    public void testLunarMathAddGetsCorrectAnswerDoubleDigitTests() {
        assertEquals(
                "10 + 20",
                20,
                new LunarMathematicsAddition(10, 20).solution()
        );
        assertEquals(
                "30 + 11",
                31,
                new LunarMathematicsAddition(30, 11).solution()
        );
        assertEquals(
                "19 + 91",
                99,
                new LunarMathematicsAddition(91, 19).solution()
        );
        assertEquals(
                "Two digits in the first number, one digit in the second number",
                51,
                new LunarMathematicsAddition(50, 1).solution()
        );
        assertEquals(
                "One digit in the first number, two digits in the second number",
                51,
                new LunarMathematicsAddition(1, 50).solution()
        );
    }

    @Test
    public void testLunarMathAddGetsCorrectAnswerEdgeCases() {
        assertEquals(
                "100 + 0",
                100,
                new LunarMathematicsAddition(100, 0).solution()
        );
        assertEquals(
                "100 + 20",
                120,
                new LunarMathematicsAddition(100, 20).solution()
        );
        assertEquals(
                11099,
                new LunarMathematicsAddition(99, 11085).solution()
        );
        assertEquals(
                59,
                new LunarMathematicsAddition(58, 19).solution()
        );
        assertEquals(
                "Integer.MAX_VALUE + 0",
                Integer.MAX_VALUE,
                new LunarMathematicsAddition(Integer.MAX_VALUE, 0).solution()
        );
        assertEquals(
                "Integer.MAX_VALUE + INTEGER.MAX_VALUE",
                Integer.MAX_VALUE,
                new LunarMathematicsAddition(Integer.MAX_VALUE, Integer.MAX_VALUE).solution()
        );
        assertEquals(
                987656789,
                new LunarMathematicsAddition(123456789, 987654321).solution()
        );
    }

}
