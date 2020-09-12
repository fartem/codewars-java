package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/5a07e5b7ffe75fd049000051
public class SortMyTextbooks {

    private final List<String> textbooks = new ArrayList<>();

    public SortMyTextbooks(List<String> textbooks) {
        this.textbooks.addAll(textbooks);
    }

    public List<String> result() {
        return textbooks.stream()
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toList());
    }

}
