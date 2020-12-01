package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/555086d53eac039a2a000083
public class OppositesAttract {

    private final int firstFlower;
    private final int secondFlower;

    public OppositesAttract(int firstFlower, int secondFlower) {
        this.firstFlower = firstFlower;
        this.secondFlower = secondFlower;
    }

    public boolean solution() {
        return (firstFlower + secondFlower) % 2 != 0;
    }

}
