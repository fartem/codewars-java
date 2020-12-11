package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HexClassTest {

    @Test
    public void SampleTests() {
        HexClass hexClass = new HexClass(255);
        assertEquals(
                "0xFF",
                hexClass.toString()
        );
        assertEquals(
                256,
                hexClass.valueOf() + 1
        );
        assertEquals(
                "0xFF",
                hexClass.toJSON()
        );
        assertEquals(
                hexClass,
                new HexClass(255)
        );
        assertEquals(
                "0xFE",
                hexClass.minus(1).toString()
        );
        assertEquals(
                "0x0",
                hexClass.minus(hexClass).toString()
        );
        assertEquals(
                "0xF",
                new HexClass(10).plus(5).toString()
        );
        assertEquals(
                32,
                HexClass.parse("0x20")
        );
        assertEquals(
                512,
                HexClass.parse("200")
        );
    }

}
