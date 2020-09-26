package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/5ad1e412cc2be1dbfb000016
public class MissingAlphabet {

    private final String input;

    public MissingAlphabet(String input) {
        this.input = input;
    }

    public String solution() {
        List<String> parsedInput = Arrays
                .stream(input.split(""))
                .collect(Collectors.toList());
        List<String> alphabet = Arrays
                .stream("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""))
                .collect(Collectors.toList());
        List<String> usedLetters = new ArrayList<>();
        return input.chars().mapToObj(value -> {
            char character = (char) value;
            String letter = String.valueOf(character);
            StringBuilder resultForSymbol = new StringBuilder(letter);
            if (!usedLetters.contains(letter)) {
                int positionInAlphabet = value - 96;
                while (positionInAlphabet < 26) {
                    String letterInAlphabet = alphabet.get(positionInAlphabet);
                    if (!parsedInput.contains(letterInAlphabet.toLowerCase())) {
                        resultForSymbol.append(letterInAlphabet);
                    }
                    positionInAlphabet++;
                }
                usedLetters.add(letter);
            }
            return resultForSymbol.toString();
        }).collect(Collectors.joining(""));
    }

}
