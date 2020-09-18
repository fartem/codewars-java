package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import javax.naming.ldap.ExtendedRequest;

import static org.junit.Assert.*;

public class ExpressionsMatterTest {

    @Test
    public void checkSmallValues() {
        assertEquals(
                6,
                new ExpressionsMatter(2, 1, 2).result()
        );
        assertEquals(
                3,
                new ExpressionsMatter(1, 1, 1).result()
        );
        assertEquals(
                4,
                new ExpressionsMatter(2, 1, 1).result()
        );
        assertEquals(
                9,
                new ExpressionsMatter(1, 2, 3).result()
        );
        assertEquals(
                5,
                new ExpressionsMatter(1, 3, 1).result()
        );
        assertEquals(
                8,
                new ExpressionsMatter(2, 2, 2).result()
        );
    }

    @Test
    public void checkIntermediateValues() {
        assertEquals(
                20,
                new ExpressionsMatter(5, 1, 3).result()
        );
        assertEquals(
                105,
                new ExpressionsMatter(3, 5, 7).result()
        );
        assertEquals(
                35,
                new ExpressionsMatter(5, 6, 1).result()
        );
        assertEquals(
                8,
                new ExpressionsMatter(1, 6, 1).result()
        );
        assertEquals(
                14,
                new ExpressionsMatter(2, 6, 1).result()
        );
        assertEquals(
                48,
                new ExpressionsMatter(6, 7, 1).result()
        );
    }

    @Test
    public void checkMixedValues() {
        assertEquals(
                60,
                new ExpressionsMatter(2, 10, 3).result()
        );
        assertEquals(
                27,
                new ExpressionsMatter(1, 8, 3).result()
        );
        assertEquals(
                126,
                new ExpressionsMatter(9, 7, 2).result()
        );
        assertEquals(
                20,
                new ExpressionsMatter(1, 1, 10).result()
        );
        assertEquals(
                18,
                new ExpressionsMatter(9, 1, 1).result()
        );
        assertEquals(
                300,
                new ExpressionsMatter(10, 5, 6).result()
        );
        assertEquals(
                12,
                new ExpressionsMatter(1, 10, 1).result()
        );
    }

}