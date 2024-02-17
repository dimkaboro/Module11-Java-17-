package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskFive {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> resultList = new ArrayList<>();

        Iterator<T> iteratorA = first.iterator();
        Iterator<T> iteratorB = second.iterator();

        while(iteratorA.hasNext() && iteratorB.hasNext()) {
            resultList.add(iteratorA.next());
            resultList.add(iteratorB.next());
        }
        return resultList.stream();
    }
}


