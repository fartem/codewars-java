package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// https://www.codewars.com/kata/594093784aafb857f0000122
public class DifferenceBetweenTwoCollections {

    private final Collection<Character> firstCollection;
    private final Collection<Character> secondCollection;

    public DifferenceBetweenTwoCollections(
            Collection<Character> firstCollection,
            Collection<Character> secondCollection
    ) {
        this.firstCollection = firstCollection;
        this.secondCollection = secondCollection;
    }

    public List<Character> solution() {
        return Stream
                .of(firstCollection, secondCollection)
                .flatMap(Collection::stream)
                .distinct()
                .filter(c -> !firstCollection.contains(c) || !secondCollection.contains(c))
                .sorted()
                .collect(Collectors.toList());
    }

}
