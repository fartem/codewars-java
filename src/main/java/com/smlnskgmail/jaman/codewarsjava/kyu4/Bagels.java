package com.smlnskgmail.jaman.codewarsjava.kyu4;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

// https://www.codewars.com/kata/54bd6b4c956834c9870001a1
public class Bagels {

    public static Bagels solution() {
        try {
            Field field = Boolean.class.getField("TRUE");
            field.setAccessible(true);

            Field modifiedField = Field.class.getDeclaredField("modifiers");
            modifiedField.setAccessible(true);
            modifiedField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

            field.set(null, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Bagels();
    }

}
