package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.example.TaskFive.zip;
import static org.example.TaskOne.sortedNames;
import static org.example.TaskThree.sortedNum;
import static org.example.TaskTwo.namesToUpper;

public class Main {
    public static void main(String[] args) {

        // Task One

//        List<String> names = Arrays.asList("Ivan", "Peter", "Dmytro", "Maksim", "Alex", "Oleg");
//        String sorted = sortedNames(names);
//        System.out.println(sorted);

        // Task Two

//        List<String> input = Arrays.asList("Ivan", "Peter", "Dmytro", "Maksim", "Alex", "Oleg");
//        List<String> upper = namesToUpper(input);
//        System.out.println("Result is: " + upper);
//    }

        // Task Three

//        String[] arr = {"1, 2, 0", "4, 5"};
//        String sorted = sortedNum(arr);
//        System.out.println(sorted);

        // Task Five

//        Stream<String> first = Stream.of("Alpha", "Beta", "Gamma");
//        Stream<String> second = Stream.of("1", "2", "3", "4");
//
//        Stream<String> result = zip(first, second);
//
//        result.peek(System.out::println).collect(Collectors.toList());

        // Task Four

        TaskFour tF = new TaskFour(25214903917L, (int) Math.pow(2,48));
        Stream<Integer> stream =
                Stream.iterate(0, (seed) -> (int) tF.c(seed).next()
                );

        stream.limit(10).peek(System.out::println).collect(Collectors.toList());
    }
}
