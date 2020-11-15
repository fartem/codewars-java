package com.smlnskgmail.jaman.codewarsjava.kyu4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class PermutationsTest {

    @Test
    public void example1() {
        assertEquals(
                new ArrayList<>(Collections.singletonList("a")),
                new Permutations("b")
                        .solution()
                        .stream()
                        .sorted()
                        .collect(Collectors.toList())
        );
    }

    @Test
    public void example2() {
        assertEquals(
                new ArrayList<>(Arrays.asList("ab", "ba")),
                new Permutations("ab")
                        .solution()
                        .stream()
                        .sorted()
                        .collect(Collectors.toList())
        );
    }

    @Test
    public void example3() {
        assertEquals(
                new ArrayList<>(Arrays.asList("aabb", "abab", "abba", "baab", "baba", "bbaa")),
                new Permutations("aabb")
                        .solution()
                        .stream()
                        .sorted()
                        .collect(Collectors.toList())
        );
    }

}
