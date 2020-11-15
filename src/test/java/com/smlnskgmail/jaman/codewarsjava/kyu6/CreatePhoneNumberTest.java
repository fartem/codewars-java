package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatePhoneNumberTest {

    @Test
    public void tests() {
        assertEquals(
                "(123) 456-7890",
                new CreatePhoneNumber(
                        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}
                ).solution()
        );
    }

}
