package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PushAHashAnObjectIntoArrayTest {

    @Test
    public void testSomething() {
        List<String> items = new PushAHashAnObjectIntoArray().solution();
        assertEquals(1, items.size());
        assertEquals("an object", items.get(0));
    }

}
