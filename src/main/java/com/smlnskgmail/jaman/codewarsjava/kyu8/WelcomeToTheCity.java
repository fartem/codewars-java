package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/5302d846be2a9189af0001e4
public class WelcomeToTheCity {

    private final String[] name;
    private final String city;
    private final String state;

    public WelcomeToTheCity(
            String[] name,
            String city,
            String state
    ) {
        this.name = name;
        this.city = city;
        this.state = state;
    }

    public String solution() {
        return String.format(
                "Hello, %s! Welcome to %s, %s!",
                String.join(" ", name),
                city,
                state
        );
    }

}
