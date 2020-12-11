package com.smlnskgmail.jaman.codewarsjava.kyu6;

// https://www.codewars.com/kata/5483366098aa442def0009af
@SuppressWarnings("checkstyle:EqualsHashCode")
public class HexClass {

    private final int input;

    public HexClass(int input) {
        this.input = input;
    }

    public int valueOf() {
        return input;
    }

    public String toJSON() {
        return toString();
    }

    public String toString() {
        return String.format(
                "0x%s",
                Integer.toHexString(input).toUpperCase()
        );
    }

    @SuppressWarnings("unused")
    public HexClass plus(HexClass other) {
        return new HexClass(input + other.input);
    }

    public HexClass plus(int number) {
        return new HexClass(input + number);
    }

    public HexClass minus(HexClass other) {
        return new HexClass(input - other.input);
    }

    public HexClass minus(int number) {
        return new HexClass(input - number);
    }

    public static int parse(String string) {
        return Integer.parseInt(
                string.startsWith("0x")
                        ? string.substring(2)
                        : string,
                16
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HexClass hex = (HexClass) o;
        return input == hex.input;
    }

}
