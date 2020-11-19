package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.List;

// https://www.codewars.com/kata/5700c9acc1555755be00027e
public class AllInclusive {

    private final String word;
    private final List<String> words;

    public AllInclusive(String word, List<String> words) {
        this.word = word;
        this.words = words;
    }

    public boolean solution() {
        for (int i = 0; i < word.length(); i++) {
            if (!words.contains(word.substring(i) + word.substring(0, i))) {
                return false;
            }
        }
        return true;
    }

}
