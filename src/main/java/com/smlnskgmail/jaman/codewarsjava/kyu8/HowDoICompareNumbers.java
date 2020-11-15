package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/55d8618adfda93c89600012e
public class HowDoICompareNumbers {

    static final Object[][] specialNumbers = {
            {42, "everything"},
            {42 * 42, "everything squared"},
    };

    private final Integer input;

    public HowDoICompareNumbers(Integer input) {
        this.input = input;
    }

    public String solution() {
        for (Object[] p : specialNumbers) {
            if (p[0].equals(input)) {
                return (String) p[1];
            }
        }
        return "nothing";
    }

}
