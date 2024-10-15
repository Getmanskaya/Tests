package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test8 {
    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(12, 45, 8, 23, 56, 99, 34);
        Optional<Integer> max =
                numbers.stream()
                        .max(Comparator.naturalOrder());
        System.out.println(max);
    }
}
