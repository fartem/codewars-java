package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.List;

// https://www.codewars.com/kata/583203e6eb35d7980400002a
public class CountTheSmileyFaces {

    private final List<String> input;

    public CountTheSmileyFaces(List<String> input) {
        this.input = input;
    }

    public int solution() {
        return (int) input
                .stream()
                .filter(s -> s.matches("([:;]?[~\\-]?[)D])"))
                .count();
    }

}
