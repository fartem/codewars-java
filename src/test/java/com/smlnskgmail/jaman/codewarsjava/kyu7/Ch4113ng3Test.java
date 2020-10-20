package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Ch4113ng3Test {

    @Test
    public void testSomething() {
        assertEquals(
                "Fund4m3nt41s",
                new Ch4113ng3("Fund4m3nt41s").solution()
        );
        assertEquals(
                "S3v3n",
                new Ch4113ng3("Seven").solution()
        );
        assertEquals(
                "Los 4ng313s",
                new Ch4113ng3("Los Angeles").solution()
        );
        assertEquals(
                "S3oijs314wuu3",
                new Ch4113ng3("Seoijselawuue").solution()
        );
    }

}
