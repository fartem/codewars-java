package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DifferenceBetweenTwoCollectionsTest {

    @Test
    public void exampleTests() {
        assertEquals(
                list(),
                new DifferenceBetweenTwoCollections(
                        list('a', 'b'),
                        list('a', 'b')
                ).solution()
        );
        assertEquals(
                list('a', 'b'),
                new DifferenceBetweenTwoCollections(
                        list('a', 'b'),
                        list()
                ).solution()
        );
        assertEquals(
                list('a', 'b'),
                new DifferenceBetweenTwoCollections(
                        list(),
                        list('a', 'b')
                ).solution()
        );
        assertEquals(
                list(),
                new DifferenceBetweenTwoCollections(
                        list(),
                        list()
                ).solution()
        );
        assertEquals(
                list('z'),
                new DifferenceBetweenTwoCollections(
                        list('a', 'b', 'z'),
                        list('a', 'b')
                ).solution()
        );
        assertEquals(
                list('d', 'e', 'j', 'z'),
                new DifferenceBetweenTwoCollections(
                        list('a', 'b', 'z', 'd', 'e', 'd'),
                        list('a', 'b', 'j', 'j')
                ).solution()
        );
    }

    public List<Character> list(char... elements) {
        ArrayList<Character> list = new ArrayList<>();
        for (char s : elements) {
            list.add(s);
        }
        return list;
    }

}
