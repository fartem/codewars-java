package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SantasNaughtyListTest {

    @Test
    public void basicTest() {
        List<String> santasList = new ArrayList<>();
        List<String> children = new ArrayList<>();

        Collections.addAll(
                santasList,
                "Jason", "Jackson", "Jordan", "Johnny"
        );
        Collections.addAll(
                children,
                "Jason", "Jordan", "Jennifer"
        );

        ArrayList<String> goodChildren = new ArrayList<>();
        Collections.addAll(
                goodChildren,
                "Jason", "Jordan"
        );

        assertEquals(
                goodChildren,
                new SantasNaughtyList(santasList, children).solution()
        );
    }

    @Test
    public void sortingTest() {
        ArrayList<String> santasList = new ArrayList<>();
        ArrayList<String> children = new ArrayList<>();

        Collections.addAll(
                santasList,
                "Jason", "Jackson", "Johnson", "JJ"
        );
        Collections.addAll(
                children,
                "Jason", "James", "JJ"
        );

        ArrayList<String> goodChildren = new ArrayList<>();
        Collections.addAll(
                goodChildren,
                "JJ", "Jason"
        );

        assertEquals(
                goodChildren,
                new SantasNaughtyList(santasList, children).solution()
        );
    }

    @Test
    public void capitalizationTest() {
        ArrayList<String> santasList = new ArrayList<>();
        ArrayList<String> children = new ArrayList<>();

        Collections.addAll(
                santasList,
                "jASon", "JAsoN", "JaSON", "jasON"
        );
        Collections.addAll(
                children,
                "JasoN", "jASOn", "JAsoN", "jASon", "JASON"
        );

        ArrayList<String> goodChildren = new ArrayList<>();
        Collections.addAll(
                goodChildren,
                "JAsoN", "jASon"
        );

        assertEquals(
                goodChildren,
                new SantasNaughtyList(santasList, children).solution()
        );
    }

}
