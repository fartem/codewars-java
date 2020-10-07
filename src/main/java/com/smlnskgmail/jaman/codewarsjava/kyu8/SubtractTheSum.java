package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.Arrays;

// https://www.codewars.com/kata/56c5847f27be2c3db20009c3
public class SubtractTheSum {

    private String[] words = new String[]{
            "kiwi", "pear", "kiwi", "banana", "melon",
            "banana", "melon", "pineapple", "apple",
            "pineapple", "cucumber", "pineapple",
            "cucumber", "orange", "grape", "orange",
            "grape", "apple", "grape", "cherry", "pear",
            "cherry", "pear", "kiwi", "banana", "kiwi",
            "apple", "melon", "banana", "melon",
            "pineapple", "melon", "pineapple",
            "cucumber", "orange", "apple", "orange",
            "grape", "orange", "grape", "cherry",
            "pear", "cherry", "pear", "apple", "pear",
            "kiwi", "banana", "kiwi", "banana",
            "melon", "pineapple", "melon",
            "apple", "cucumber", "pineapple", "cucumber",
            "orange", "cucumber", "orange", "grape",
            "cherry", "apple", "cherry", "pear", "cherry",
            "pear", "kiwi", "pear", "kiwi", "banana",
            "apple", "banana", "melon", "pineapple",
            "melon", "pineapple", "cucumber", "pineapple",
            "cucumber", "apple", "grape", "orange", "grape",
            "cherry", "grape", "cherry", "pear", "cherry",
            "apple", "kiwi", "banana", "kiwi", "banana", "melon",
            "banana", "melon", "pineapple", "apple", "pineapple"
    };

    private int input;

    public SubtractTheSum(int input) {
        this.input = input;
    }

    public String solution() {
        do {
            input -= Arrays
                    .stream(String.valueOf(input).split(""))
                    .mapToInt(Integer::parseInt)
                    .sum();
        } while (input > 100);
        return words[input - 1];
    }

}
