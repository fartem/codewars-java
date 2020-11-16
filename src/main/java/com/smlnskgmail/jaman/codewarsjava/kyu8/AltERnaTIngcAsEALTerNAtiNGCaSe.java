package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.stream.Collectors;

// https://www.codewars.com/kata/56efc695740d30f963000557
public class AltERnaTIngcAsEALTerNAtiNGCaSe {

    private final String input;

    public AltERnaTIngcAsEALTerNAtiNGCaSe(String input) {
        this.input = input;
    }

    public String solution() {
        return input
                .chars()
                .mapToObj(i -> {
                    char symbol = (char) i;
                    if (!Character.isLetter(symbol)) {
                        return String.valueOf((char) i);
                    }
                    return String.valueOf(
                            Character.isLowerCase(symbol)
                                    ? Character.toUpperCase(symbol)
                                    : Character.toLowerCase(symbol)
                    );
                })
                .collect(Collectors.joining());
    }

}
