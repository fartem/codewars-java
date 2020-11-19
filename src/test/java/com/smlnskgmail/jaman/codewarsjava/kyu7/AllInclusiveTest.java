package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AllInclusiveTest {

    @Test
    public void test() {
        assertTrue(
                new AllInclusive(
                        "",
                        Collections.emptyList()
                ).solution()
        );
        assertTrue(
                new AllInclusive(
                        "",
                        Arrays.asList("bsjq", "qbsj")
                ).solution()
        );
        assertTrue(
                new AllInclusive(
                        "bsjq",
                        Arrays.asList("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")
                ).solution()
        );
        assertFalse(
                new AllInclusive(
                        "XjYABhR",
                        Arrays.asList(
                                "TzYxlgfnhf",
                                "yqVAuoLjMLy",
                                "BhRXjYA",
                                "YABhRXj",
                                "hRXjYAB",
                                "jYABhRX",
                                "XjYABhR",
                                "ABhRXjY"
                        )
                ).solution()
        );
    }

}
