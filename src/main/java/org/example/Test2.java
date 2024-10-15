package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {

        class Person {
            String name;
            Integer age;

            Person(String name, Integer age) {
                this.name = name;
                this.age = age;
            }

            public Integer getAge() {
                return age;
            }
            public String toString() {
                return name;
            }
        }

        final List<Person> persons = Arrays.asList(
                new Person("Nastya", 28),
                new Person("Jenny", 33),
                new Person("Mark", 5),
                new Person("David", 6)
        );


        List<Person> sortedPersons
                = persons.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
        System.out.println(sortedPersons);

       /* Обратный порядок
       List<Person> sortedPersons
                = persons.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());
        System.out.println(sortedPersons);*/
    }
}
