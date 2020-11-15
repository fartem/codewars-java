package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DataReverseTest {

    @Test
    public void Test1() {
        int[] data1 = {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0};
        int[] data2 = {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1};
        assertArrayEquals(
                data2,
                new DataReverse(data1).solution()
        );
    }

    @Test
    public void Test2() {
        int[] data1 = {0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1};
        int[] data2 = {0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0};
        assertArrayEquals(
                data2,
                new DataReverse(data1).solution()
        );
    }

}
