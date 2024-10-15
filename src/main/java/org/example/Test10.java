package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test10 {
    public static void main(String[] args) {
        final List<String> words = Arrays.asList("apple", "pear", "banana", "kiwi", "mango", "cherry");
        Map<Integer, List<String>> groupedFruits = words.stream()
                            .collect(Collectors.groupingBy(String::length));
        System.out.println(groupedFruits);
    }
}
