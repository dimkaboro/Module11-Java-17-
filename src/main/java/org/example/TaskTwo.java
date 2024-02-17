package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskTwo {
    public static List<String> namesToUpper(List<String> input) {
        return input.stream()
                .map(w -> w.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
