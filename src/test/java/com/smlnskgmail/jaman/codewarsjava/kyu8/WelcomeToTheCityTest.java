package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WelcomeToTheCityTest {

    @Test
    public void test1() {
        assertEquals(
                "Hello, John Smith! Welcome to Phoenix, Arizona!",
                new WelcomeToTheCity(
                        new String[] { "John", "Smith" },
                        "Phoenix",
                        "Arizona"
                ).solution()
        );
    }

}
