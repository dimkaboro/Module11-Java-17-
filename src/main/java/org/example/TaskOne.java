package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TaskOne {
    public static String sortedNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(index -> index % 2 == 0)
                .mapToObj(index -> names.get(index))
                .collect(Collectors.joining(", "));
    }
}
