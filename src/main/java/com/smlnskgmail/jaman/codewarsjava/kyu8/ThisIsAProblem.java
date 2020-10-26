package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/547c71fdc5b2b38db1000098
public class ThisIsAProblem {

    private final String firstName;
    private final String lastName;
    private final String fullName;

    public ThisIsAProblem(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = String.format("%s %s", firstName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

}
