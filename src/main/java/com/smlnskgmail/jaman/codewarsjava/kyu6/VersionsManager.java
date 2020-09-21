package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/5bc7bb444be9774f100000c3
public class VersionsManager {

    private final Stack<int[]> memory = new Stack<>();
    private int[] current = { 0, 0, 1 };

    public VersionsManager() {

    }

    public VersionsManager(String input) {
        if (!input.isEmpty()) {
            String[] arr = input.split("\\.");
            try {
                for (int i = 0; i < 3; i++) {
                    current[i] = i < arr.length
                            ? Integer.parseInt(arr[i])
                            : 0;
                }
            } catch (Exception e) {
                throw new RuntimeException(
                        "Error occured while parsing version!"
                );
            }
        }
    }

    public VersionsManager major() {
        update(0);
        return this;
    }

    private void update(int i) {
        memory.add(Arrays.copyOf(current, 3));
        current[i] += 1;
        for (int x=i+1 ; x<3 ; x++) {
            current[x] = 0;
        }
    }

    public VersionsManager minor() {
        update(1);
        return this;
    }

    public VersionsManager patch() {
        update(2);
        return this;
    }

    public String release() {
        return Arrays
                .stream(current)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining("."));
    }

    public VersionsManager rollback() {
        if (memory.isEmpty()) {
            throw new RuntimeException("Cannot rollback!");
        }
        current = memory.pop();
        return this;
    }

}
