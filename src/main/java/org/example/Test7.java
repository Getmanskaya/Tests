package org.example;

import java.util.Arrays;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        final List<String> numbersAsString = Arrays.asList("1", "2", "3", "4", "5", "6");

                numbersAsString.stream()
                        .map(Integer::parseInt)
                        .filter(n -> n % 2 == 0)
                        .map(s1 -> {
                            /*System.out.println("map: " + s1);*/
                            return s1 * s1;
                        })
                        .forEach(x -> {
                            System.out.println(x);
                        });

    }
}
