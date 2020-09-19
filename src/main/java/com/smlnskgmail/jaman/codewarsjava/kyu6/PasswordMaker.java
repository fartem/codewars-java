package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// https://www.codewars.com/kata/5b3d5ad43da310743c000056
public class PasswordMaker {

    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";

    private final int length;
    private final boolean upperCase;
    private final boolean lowerCase;
    private final boolean digits;

    public PasswordMaker(
            int length,
            boolean upperCase,
            boolean lowerCase,
            boolean digits
    ) {
        this.length = length;
        this.upperCase = upperCase;
        this.lowerCase = lowerCase;
        this.digits = digits;
    }

    public String result() {
        if (length == 0) {
            return "";
        }

        List<String> characters = new LinkedList<>();
        if (upperCase) {
            characters.add(UPPER);
        }
        if (lowerCase) {
            characters.add(LOWER);
        }
        if (digits) {
            characters.add(DIGITS);
        }

        StringBuilder password = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            String charCategory = characters.get(
                    random.nextInt(characters.size())
            );
            int position = random.nextInt(charCategory.length());

            char candidate = charCategory.charAt(position);
            String buildingPassword = password.toString();
            if (!buildingPassword.contains(String.valueOf(candidate))) {
                if (lowerCase) {
                    if (buildingPassword.chars().filter(Character::isLowerCase).sum() == 0) {
                        candidate = LOWER.charAt(random.nextInt(26));
                    }
                }
                if (upperCase) {
                    if (buildingPassword.chars().filter(Character::isUpperCase).sum() == 0) {
                        candidate = UPPER.charAt(random.nextInt(26));
                    }
                }
                if (digits) {
                    if (buildingPassword.chars().filter(Character::isDigit).sum() == 0) {
                        candidate = DIGITS.charAt(random.nextInt(10));
                    }
                }
                password.append(candidate);
            } else {
                i--;
            }
        }
        return password.toString();
    }

}
