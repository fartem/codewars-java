package com.smlnskgmail.jaman.codewarsjava.kyu6;

// https://www.codewars.com/kata/56a5d994ac971f1ac500003e
public class ConsecutiveStrings {

    private final String[] array;

    @SuppressWarnings("checkstyle:memberName")
    private final int k;

    public ConsecutiveStrings(String[] array, int k) {
        this.array = array;
        this.k = k;
    }

    public String solution() {
        int arrayLength = array.length;

        String result = "";
        if (arrayLength == 0 || arrayLength < k || k <= 0) {
            return result;
        }

        for (int i = 0; i < arrayLength - k + 1; i++) {
            StringBuilder tempData = new StringBuilder();
            for (int j = i; j < i + k; j++) {
                tempData.append(array[j]);
            }
            if (result.length() < tempData.length()) {
                result = tempData.toString();
            }
        }
        return result;
    }

}
