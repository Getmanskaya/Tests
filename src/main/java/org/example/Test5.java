package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Test5 {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("Stream", "API", "is", "cool");
            String newString =
                 strings.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(" "));

                 System.out.println(newString);
    }
}

