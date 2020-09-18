package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingAlphabetTest {

    @Test
    public void basicTest() {
        assertEquals(
                "hIJKMNPQRSTUVWXYZeFGIJKMNPQRSTUVWXYZlMNPQRSTUVWXYZloPQRSTUVWXYZ",
                new MissingAlphabet("hello").result()
        );
    }

}