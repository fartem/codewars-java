package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/53f1015fa9fe02cbda00111a
public class ColorGhost {

    private final String[] colors = new String[] {
            "white",
            "yellow",
            "purple",
            "red"
    };

    public String solution() {
        int index = (int) (Math.random() * colors.length);
        return colors[index];
    }

}
