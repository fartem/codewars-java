package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9
public class ShortestWord {

    private final String input;

    public ShortestWord(String input) {
        this.input = input;
    }

    public int solution() {
        String[] words = input.split(" ");
        int shortestWord = 0;
        for (String word : words) {
            if (shortestWord == 0 || shortestWord > word.length()) {
                shortestWord = word.length();
            }
        }
        return shortestWord;
    }

}
