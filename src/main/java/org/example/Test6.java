package org.example;

import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(3, 4, 2, 7, 8, 5, 3, 7);
        long total =
                numbers.stream()
                        .filter(n -> n > 5)
                        .count();
        System.out.println(total);
    }
}
