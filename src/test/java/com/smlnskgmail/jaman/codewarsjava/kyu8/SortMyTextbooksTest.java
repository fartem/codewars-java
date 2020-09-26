package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortMyTextbooksTest {

    @Test
    public void basicTest() {
        List<String> strs = new ArrayList<>();
        Collections.addAll(
                strs,
                "Algebra",
                "History",
                "Geometry",
                "English"
        );

        List<String> sorted = new ArrayList<>();
        Collections.addAll(
                sorted,
                "Algebra",
                "English",
                "Geometry",
                "History"
        );

        assertEquals(
                sorted,
                new SortMyTextbooks(strs).solution()
        );
    }

    @Test
    public void capitalizationTest() {
        ArrayList<String> strs = new ArrayList<>();
        Collections.addAll(
                strs,
                "Algebra",
                "history",
                "Geometry",
                "english"
        );

        ArrayList<String> sorted = new ArrayList<>();
        Collections.addAll(
                sorted,
                "Algebra",
                "english",
                "Geometry",
                "history"
        );

        assertEquals(
                sorted,
                new SortMyTextbooks(strs).solution()
        );
    }

    @Test
    public void symbolsTest() {
        ArrayList<String> strs = new ArrayList<>();
        Collections.addAll(
                strs,
                "Alg#bra",
                "$istory",
                "Geom^try",
                "**English"
        );

        ArrayList<String> sorted = new ArrayList<>();
        Collections.addAll(
                sorted,
                "$istory",
                "**English",
                "Alg#bra",
                "Geom^try"
        );

        assertEquals(
                sorted,
                new SortMyTextbooks(strs).solution()
        );
    }

}
