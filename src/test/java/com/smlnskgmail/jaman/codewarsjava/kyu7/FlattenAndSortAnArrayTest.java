package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FlattenAndSortAnArrayTest {

    @Test
    public void exampleTest() {
        assertArrayEquals(
                new int[]{},
                new FlattenAndSortAnArray(
                        new int[][]{}
                ).solution()
        );
        assertArrayEquals(
                new int[]{1},
                new FlattenAndSortAnArray(
                        new int[][]{{}, {1}}
                ).solution()
        );
        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
                new FlattenAndSortAnArray(
                        new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}}
                ).solution()
        );
        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6, 100},
                new FlattenAndSortAnArray(
                        new int[][]{{1, 3, 5}, {100}, {2, 4, 6}}
                ).solution()
        );
        assertArrayEquals(
                new int[]{111, 222, 333, 444, 555, 666, 777, 888, 999},
                new FlattenAndSortAnArray(
                        new int[][]{{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}}
                ).solution()
        );
    }

}
