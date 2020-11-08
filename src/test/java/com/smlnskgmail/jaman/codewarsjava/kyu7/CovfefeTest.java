package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CovfefeTest {

    @Test
    public void basicTest() {
        assertEquals(
                "covfefe",
                new Covfefe("coverage").solution()
        );
        assertEquals(
                "covfefe covfefe",
                new Covfefe("coverage coverage").solution()
        );
        assertEquals(
                "nothing covfefe",
                new Covfefe("nothing").solution()
        );
        assertEquals(
                "double space  covfefe",
                new Covfefe("double space ").solution()
        );
        assertEquals(
                "covfefe covfefe",
                new Covfefe("covfefe").solution()
        );
    }

}
