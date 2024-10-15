package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test9 {
    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3);
        numbers.stream()
                .distinct()
                .forEach(x -> {
                    System.out.println(x);
                });
    }
}
