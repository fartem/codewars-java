package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Arrays;

// https://www.codewars.com/kata/5af15a37de4c7f223e00012d
public class SortOutTheMenFromBoys {

    private final int[] input;

    public SortOutTheMenFromBoys(int[] input) {
        this.input = input;
    }

    public int[] result() {
        int[] boys = Arrays
                .stream(input)
                .distinct()
                .boxed()
                .filter(integer -> integer % 2 != 0)
                .sorted((o1, o2) -> -Integer.compare(o1, o2))
                .mapToInt(value -> value)
                .toArray();
        int[] men = Arrays
                .stream(input)
                .distinct()
                .filter(value -> value % 2 == 0)
                .sorted()
                .toArray();

        int[] result = new int[men.length + boys.length];
        System.arraycopy(
                men,
                0,
                result,
                0,
                men.length
        );
        System.arraycopy(
                boys,
                0,
                result,
                men.length,
                boys.length
        );
        return result;
    }

}
