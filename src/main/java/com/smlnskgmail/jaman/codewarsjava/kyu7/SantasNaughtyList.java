package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/5a0b4dc2ffe75f72f70000ef
public class SantasNaughtyList {

    private final List<String> santasList = new ArrayList<>();
    private final List<String> children = new ArrayList<>();

    public SantasNaughtyList(
            List<String> santasList,
            List<String> children
    ) {
        this.santasList.addAll(santasList);
        this.children.addAll(children);
    }

    List<String> solution() {
        return children.stream()
                .filter(kid -> {
                    String nameWithCasedLetter = kid.substring(0, 1).toUpperCase() + kid.substring(1);
                    return santasList.contains(kid) || santasList.contains(nameWithCasedLetter);
                })
                .distinct()
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }

}
