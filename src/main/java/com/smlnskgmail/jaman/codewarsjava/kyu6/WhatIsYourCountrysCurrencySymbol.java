package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WhatIsYourCountrysCurrencySymbol {

    private final String input;

    public WhatIsYourCountrysCurrencySymbol(String input) {
        this.input = input;
    }

    public String solution() {
        Map<String, Locale> countries = new HashMap<>();
        for (String c : Locale.getISOCountries()) {
            Locale locale = new Locale("", c);
            countries.put(locale.getDisplayCountry(), locale);
        }
        if (countries.get(input) == null) {
            throw new IllegalArgumentException();
        }
        return Currency.getInstance(countries.get(input)).getCurrencyCode();
    }

}
