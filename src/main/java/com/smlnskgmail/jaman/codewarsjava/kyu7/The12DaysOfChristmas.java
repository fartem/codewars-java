package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Comparator;

// https://www.codewars.com/kata/57dd3a06eb0537b899000a64
public class The12DaysOfChristmas implements Comparator<String> {

    @Override
    public int compare(final String line1, final String line2) {
        char line1FirstSymbol = line1.charAt(0);
        char line2FirstSymbol = line2.charAt(0);
        if (Character.isLetter(line1FirstSymbol)
                && Character.isLetter(line2FirstSymbol)) {
            return Character.compare(line1FirstSymbol, line2FirstSymbol);
        } else if (Character.isLetter(line1FirstSymbol)) {
            return Character.isLowerCase(line1FirstSymbol) ? 1 : -1;
        } else if (Character.isLetter(line2FirstSymbol)) {
            return Character.isLowerCase(line2FirstSymbol) ? -1 : 1;
        } else {
            int line1Number = Integer.parseInt(
                    Character.getNumericValue(line1FirstSymbol) == 1
                            ? line1.substring(0, 2)
                            : line1.substring(0, 1)
            );
            int line2Number = Integer.parseInt(
                    Character.getNumericValue(line2FirstSymbol) == 1
                            ? line2.substring(0, 2)
                            : line2.substring(0, 1)
            );
            return -Integer.compare(line1Number, line2Number);
        }
    }

}
