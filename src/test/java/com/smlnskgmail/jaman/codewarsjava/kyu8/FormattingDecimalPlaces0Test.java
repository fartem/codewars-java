package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormattingDecimalPlaces0Test {

    @Test
    public void Test01() {
        assertEquals(
                4.66,
                new FormattingDecimalPlaces0(4.659725356).solution(),
                0.00
        );
    }

    @Test
    public void Test02() {
        assertEquals(
                173735326.38,
                new FormattingDecimalPlaces0(173735326.3783732637948948).solution(),
                0.00
        );
    }

}
