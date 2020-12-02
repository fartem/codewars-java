package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CountTheSmileyFacesTest {

    @Test
    public void test1() {
        assertEquals(
                2,
                new CountTheSmileyFaces(
                        Arrays.asList(
                                ":)",
                                ":D",
                                ":-}",
                                ":-()"
                        )
                ).solution()
        );
    }

    @Test
    public void test2() {
        assertEquals(
                1,
                new CountTheSmileyFaces(
                        Arrays.asList(
                                ":)",
                                "XD",
                                ":0}",
                                "x:-",
                                "):-",
                                "D:"
                        )
                ).solution()
        );
    }

    @Test
    public void test3() {
        assertEquals(
                2,
                new CountTheSmileyFaces(
                        Arrays.asList(
                                ":)",
                                ":D",
                                "X-}",
                                "xo)",
                                ":X",
                                ":-3",
                                ":3"
                        )
                ).solution()
        );
    }

    @Test
    public void test4() {
        assertEquals(
                4,
                new CountTheSmileyFaces(
                        Arrays.asList(
                                ":)",
                                ":)",
                                "x-]",
                                ":ox",
                                ";-(",
                                ";-)",
                                ";~(",
                                ":~D"
                        )
                ).solution()
        );
    }

}
