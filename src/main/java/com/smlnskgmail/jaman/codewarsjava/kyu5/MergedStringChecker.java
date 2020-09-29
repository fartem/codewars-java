package com.smlnskgmail.jaman.codewarsjava.kyu5;

// https://www.codewars.com/kata/54c9fcad28ec4c6e680011aa
public class MergedStringChecker {

    private final String string;
    private final String firstPart;
    private final String secondPart;

    public MergedStringChecker(
            String string,
            String firstPart,
            String secondPart
    ) {
        this.string = string;
        this.firstPart = firstPart;
        this.secondPart = secondPart;
    }

    public boolean solution() {
        return isMerge(string, firstPart, secondPart);
    }

    private boolean isMerge(
            String string,
            String firstPart,
            String secondPart
    ) {
        if (string.equals("")) {
            return firstPart.equals("") && secondPart.equals("");
        }

        boolean isMergeFromPart1 = false;
        boolean isMergeFromPart2 = false;

        if (firstPart.length() > 0 && string.charAt(0) == firstPart.charAt(0)) {
            isMergeFromPart1 = isMerge(
                    string.substring(1),
                    firstPart.substring(1),
                    secondPart
            );
        }
        if (secondPart.length() > 0 && string.charAt(0) == secondPart.charAt(0)) {
            isMergeFromPart2 = isMerge(
                    string.substring(1),
                    firstPart,
                    secondPart.substring(1)
            );
        }
        return isMergeFromPart1 || isMergeFromPart2;
    }

}
