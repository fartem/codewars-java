package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeAFunctionThatDoesArithmeticTest {

    @Test
    public void testBasic() {
        assertEquals(
                3,
                new MakeAFunctionThatDoesArithmetic(
                        1,
                        2,
                        "add"
                ).solution()
        );
        assertEquals(
                6,
                new MakeAFunctionThatDoesArithmetic(
                        8,
                        2,
                        "subtract"
                ).solution()
        );
        assertEquals(
                10,
                new MakeAFunctionThatDoesArithmetic(
                        5,
                        2,
                        "multiply"
                ).solution()
        );
        assertEquals(
                4,
                new MakeAFunctionThatDoesArithmetic(
                        8,
                        2,
                        "divide"
                ).solution()
        );
    }

}
