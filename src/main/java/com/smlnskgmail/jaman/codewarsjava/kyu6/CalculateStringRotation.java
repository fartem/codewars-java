package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

// https://www.codewars.com/kata/5596f6e9529e9ab6fb000014
public class CalculateStringRotation {

    private final String start;
    private final String end;

    public CalculateStringRotation(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public int solution() {
        List<String> symbols = Arrays.asList(start.split(""));
        int length = start.length();
        return IntStream
                .range(0, length)
                .filter(value -> {
                    List<String> tempSymbols = new ArrayList<>(symbols);
                    Collections.rotate(tempSymbols, value);
                    return end.equals(String.join("", tempSymbols));
                })
                .findFirst()
                .orElse(-1);
    }

}
