package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/597c684822bc9388f600010f
public class FIXMEGetFullName {

    private final String firstName;
    private final String lastName;

    public FIXMEGetFullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        int firstNameLength = firstName.length();
        int lastNameLength = lastName.length();
        if (firstNameLength == 0 && lastNameLength == 0) {
            return "";
        } else if (firstNameLength == 0) {
            return lastName;
        } else if (lastNameLength == 0) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }

}
