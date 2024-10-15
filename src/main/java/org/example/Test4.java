package org.example;

import java.util.Arrays;
import java.util.List;

public class Test4 { public static void main(String[] args) {
    final List<String> words = Arrays.asList("apple", "banana", "avocado", "cherry", "blueberry", "mango");

    words.stream()
            .filter(n -> n.charAt(0) == 'b')
            .limit(1)
            .forEach(x -> {
                System.out.println(x);
            });
}
}
