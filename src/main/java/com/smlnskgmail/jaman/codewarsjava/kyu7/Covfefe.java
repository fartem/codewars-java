package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/592fd8f752ee71ac7e00008a
public class Covfefe {

    private final String input;

    public Covfefe(String input) {
        this.input = input;
    }

    public String solution() {
        String keyWord = "coverage";
        String replaceTo = "covfefe";
        if (input.contains(keyWord)) {
            return input.replaceAll(keyWord, replaceTo);
        } else {
            return input.concat(" ").concat(replaceTo);
        }
    }

}
