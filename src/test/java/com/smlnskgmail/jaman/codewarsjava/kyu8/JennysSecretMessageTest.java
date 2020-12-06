package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JennysSecretMessageTest {

    @Test
    public void Test() {
        assertEquals(
                "Hello, Jim!",
                new JennysSecretMessage("Jim").solution()
        );
        assertEquals(
                "Hello, Jane!",
                new JennysSecretMessage("Jane").solution()
        );
        assertEquals(
                "Hello, Simon!",
                new JennysSecretMessage("Simon").solution()
        );
        assertEquals(
                "Hello, my love!",
                new JennysSecretMessage("Johnny").solution()
        );
    }

}
