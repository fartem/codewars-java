package com.smlnskgmail.jaman.codewarsjava.kyu6;

// https://www.codewars.com/kata/545cedaa9943f7fe7b000048
public class DetectPangram {

    private final String input;

    public DetectPangram(String input) {
        this.input = input;
    }

    public boolean solution() {
        return input
                .toLowerCase()
                .chars()
                .filter(Character::isLetter)
                .distinct()
                .count() == 26;
    }

}
