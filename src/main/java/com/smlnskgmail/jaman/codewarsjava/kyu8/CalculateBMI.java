package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/57a429e253ba3381850000fb
public class CalculateBMI {

    private final double weight;
    private final double height;

    public CalculateBMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public String solution() {
        double bmi = weight / (height * height);
        if (bmi > 30) {
            return "Obese";
        } else if (bmi > 25.0 && bmi <= 30) {
            return "Overweight";
        } else if (bmi > 18.5 && bmi <= 25.0) {
            return "Normal";
        } else {
            return "Underweight";
        }
    }

}
