package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/56f173a35b91399a05000cb7
public class SquashTheBugs {

    private final String input;

    public SquashTheBugs(String input) {
        this.input = input;
    }

    public int solution() {
        String[] spl = input.split(" ");
        int longest = 0;
        for (int i = 0; i < spl.length; i++) {
            if (spl[i].length() > longest) {
                longest = spl[i].length();
            }
        }
        return longest;
    }

}
