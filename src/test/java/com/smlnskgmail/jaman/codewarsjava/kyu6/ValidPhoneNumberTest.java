package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidPhoneNumberTest {

    @Test
    public void tests() {
        assertTrue(new ValidPhoneNumber("(123) 456-7890").solution());
        assertFalse(new ValidPhoneNumber("(1111)555 2345").solution());
        assertFalse(new ValidPhoneNumber("(098) 123 4567").solution());
    }

}
