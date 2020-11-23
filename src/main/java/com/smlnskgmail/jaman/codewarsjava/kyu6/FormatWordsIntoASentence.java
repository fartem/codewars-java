package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/51689e27fe9a00b126000004
public class FormatWordsIntoASentence {

    private final String[] input;

    public FormatWordsIntoASentence(String[] input) {
        this.input = input;
    }

    public String solution() {
        if (input == null) {
            return "";
        }
        List<String> filteredWords = Arrays
                .stream(input)
                .filter(s -> s.length() > 0)
                .collect(Collectors.toList());
        int inputLength = filteredWords.size();
        switch (inputLength) {
            case 0:
                return "";
            case 1:
                return filteredWords.get(0);
            case 2:
                return String.format(
                        "%s and %s",
                        filteredWords.get(0),
                        filteredWords.get(1)
                );
            default:
                return String.format(
                        "%s and %s",
                        String.join(
                                ", ",
                                filteredWords.subList(0, inputLength - 1)
                        ),
                        filteredWords.get(inputLength - 1)
                );
        }
    }

}
