package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.stream.Collectors;

// https://www.codewars.com/kata/591cac98a6007e87d900013a
public class ChangeCase {

    private final String input;

    public ChangeCase(String input) {
        this.input = input;
    }

    public String toSentenceCase() {
        boolean capitalizeNeeded = true;
        char[] chars = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            if (capitalizeNeeded && Character.isAlphabetic(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                capitalizeNeeded = false;
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
                if (chars[i] == '.' || chars[i] == '?' || chars[i] == '!') {
                    capitalizeNeeded = true;
                }
                if (chars[i] == ',' || chars[i] == ' ' || Character.isDigit(chars[i])) {
                    capitalizeNeeded = false;
                }
            }
        }
        return new String(chars);
    }

    public String toLowerCase() {
        return input.toLowerCase();
    }

    public String toUpperCase() {
        return input.toUpperCase();
    }

    public String capitalizeEachWord() {
        boolean capitalizeNeeded = true;
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (capitalizeNeeded && Character.isAlphabetic(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                capitalizeNeeded = false;
            } else if (Character.isAlphabetic(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else capitalizeNeeded = !Character.isDigit(chars[i]);
        }
        return new String(chars);
    }

    public String toToggleCase() {
        return input
                .chars()
                .mapToObj(operand -> {
                    char value = (char) operand;
                    if (Character.isLetter(value)) {
                        return String.valueOf(
                                Character.isLowerCase(value)
                                        ? Character.toUpperCase(value)
                                        : Character.toLowerCase(value)
                        );
                    } else {
                        return String.valueOf(value);
                    }
                })
                .collect(Collectors.joining());
    }

}
