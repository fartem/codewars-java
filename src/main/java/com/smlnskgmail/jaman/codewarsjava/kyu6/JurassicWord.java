package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.Arrays;
import java.util.Objects;

// https://www.codewars.com/kata/55709dc15ebd283cc9000007
public class JurassicWord {

    private final String input;

    public JurassicWord(String input) {
        this.input = input;
    }

    public String solution() {
        String dino = whichDino(new StringBuilder(input).reverse().substring(3, 8));
        String something = "Something";
        if (input.matches("_C.*C}>")) {
            return (Arrays.asList("velociraptor", "T-Rex").contains(dino) ? "A " + dino : something)
                    + " is eating a dead dino.";
        } else if (input.matches("iii.*iii")) {
            return (Arrays.asList("brachiosaurus", "triceratops").contains(dino) ? "A " + dino : something)
                    + " is eating flowers.";
        } else if (input.matches("\\|\\|\\|.*\\|\\|\\|")) {
            return (Objects.equals("brachiosaurus", dino) ? "A " + dino : something)
                    + " is eating leaves.";
        }
        return (Arrays.asList("brachiosaurus", "triceratops", "velociraptor", "T-Rex").contains(dino)
                ? "A " + dino
                : something)
                + " is eating something.";
    }

    private String whichDino(String dino) {
        switch (dino) {
            case "uuuuu":
                return "brachiosaurus";
            case "uuVuu":
                return "triceratops";
            case "VvvvV":
                return "T-Rex";
            case "vvvvv":
                return "velociraptor";
            default:
                return null;
        }
    }

}
