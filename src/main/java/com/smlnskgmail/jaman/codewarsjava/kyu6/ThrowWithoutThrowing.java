package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.*;

// https://www.codewars.com/kata/5943db60800cebe12000003d
public class ThrowWithoutThrowing {

    public static void arrayIndexOutOfBound() {
        int[] data = new int[3];
        System.out.println(data[5]);
    }

    public static void negativeArraySize() {
        System.out.println(new int[-1]);
    }

    public static void noSuchElement() {
        List<String> al = new ArrayList<>();
        Iterator<String> itr = al.iterator();
        System.out.println(itr.next());
    }

    public static void arithmetic() {
        System.out.println(5 / 0);
    }

    public static void classCast() {
        System.out.println(((String) new Object()).length());
    }

    public static void stackOverflow() {
        value(1);
    }

    private static void value(int i) {
        if (i == 0) {
            return;
        } else {
            value(i++);
        }
    }

    public static void nullPointer() {
        String string = null;
        System.out.println(string.charAt(0));
    }

    public static void numberFormat() {
        System.out.println(Integer.parseInt("1-9"));
    }

    public static void illegalArgument() {
        System.out.println(Character.toChars(324322111));
    }

    public static void emptyStack() {
        Stack<String> stack = new Stack<>();
        System.out.println(stack.pop());
    }

    // https://stackoverflow.com/questions/43413668/why-am-i-getting-a-java-nio-bufferoverflowexception
    public static void bufferOverflow() {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(10);
        FloatBuffer floatBuffer = byteBuffer.asFloatBuffer();
        floatBuffer.put(new float[] {1, 0, 0});
    }

    @SuppressWarnings("checkstyle:arrayTypeStyle")
    public static void arrayStore() {
        Object x[] = new String[3];
        x[0] = new Integer(0);
    }

    public static void unsupportedOperation() {
        List<String> data = Collections.emptyList();
        data.add("");
        System.out.println(data.get(0));
    }

    // Based on: https://stackoverflow.com/questions/20169127/what-is-illegalstateexception
    public static void illegalState() {
        List<String> al = new ArrayList<>();
        al.add("item");
        al.add("item");
        al.add("item");
        al.add("item");
        al.add("item");
        al.add("item");
        al.add("item");
        al.add("item");
        al.add("item");
        al.add("item");
        al.add("item");
        al.add("item");
        al.add("item");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            itr.remove();
        }
    }

}
