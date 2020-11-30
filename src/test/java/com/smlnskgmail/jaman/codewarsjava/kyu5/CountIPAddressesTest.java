package com.smlnskgmail.jaman.codewarsjava.kyu5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountIPAddressesTest {

    @Test
    public void ipsBetween() {
        assertEquals(
                50,
                new CountIPAddresses("10.0.0.0", "10.0.0.50").solution()
        );
        assertEquals(
                246,
                new CountIPAddresses("20.0.0.10", "20.0.1.0").solution()
        );
    }

}
