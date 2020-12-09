package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddEvenStringSortTest {

    @Test
    public void testSomething() {
        assertEquals(
                "Wleclgltihuebredrf ofsheesenasnegrof",
                new OddEvenStringSort(
                        "Wolfeschlegelsteinhausenbergerdorff"
                ).solution()
        );
        assertEquals(
                "MTINLHENLHENGUAIYAGNL EHOYTROYTROYLTMNLRIY",
                new OddEvenStringSort(
                        "METHIONYLTHREONYLTHREONYGLUTAMINYLARGINYL"
                ).solution()
        );
        assertEquals(
                "PEMNUTAIRSOISLCVLAOOISS NUOOLRMCOCPCIIOOCNCNOI",
                new OddEvenStringSort(
                        "PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS"
                ).solution()
        );
        assertEquals(
                "PEDPEDHPPRTYODS SUOSUOYOAAHRIIM",
                new OddEvenStringSort(
                        "PSEUDOPSEUDOHYPOPARATHYROIDISM"
                ).solution()
        );
        assertEquals(
                "FOCNUIIIIIIIAIN LCIACNHLPLFCTO",
                new OddEvenStringSort(
                        "FLOCCINAUCINIHILIPILIFICATION"
                ).solution()
        );
        assertEquals(
                "SBEMTGYHC UDRAOLPI",
                new OddEvenStringSort(
                        "SUBDERMATOGLYPHIC"
                ).solution()
        );
    }

}
