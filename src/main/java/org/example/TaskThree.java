package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskThree {
    public static String sortedNum(String[] arr) {
        return Arrays.stream(arr)
                .flatMap(n -> Arrays.stream(n.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
