package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhatIsYourCountrysCurrencySymbolTest {

    @Test
    public void basicTest() {
        assertEquals(
                "RUB",
                new WhatIsYourCountrysCurrencySymbol(
                        "Russia"
                ).solution()
        );
        assertEquals(
                "EUR",
                new WhatIsYourCountrysCurrencySymbol(
                        "France"
                ).solution()
        );
        assertEquals(
                "EUR",
                new WhatIsYourCountrysCurrencySymbol(
                        "Germany"
                ).solution()
        );
        assertEquals(
                "CNY",
                new WhatIsYourCountrysCurrencySymbol(
                        "China"
                ).solution()
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrongCountry() throws Exception {
        String symbol = new WhatIsYourCountrysCurrencySymbol(
                "SomeUnknownCountry"
        ).solution();
    }

}
