package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoToOneTest {

    @Test
    public void test() {
        assertEquals(
                "aehrsty",
                new TwoToOne("aretheyhere", "yestheyarehere").solution()
        );
        assertEquals(
                "abcdefghilnoprstu",
                new TwoToOne("loopingisfunbutdangerous", "lessdangerousthancoding").solution()
        );
        assertEquals(
                "acefghilmnoprstuy",
                new TwoToOne("inmanylanguages", "theresapairoffunctions").solution()
        );
    }

}
