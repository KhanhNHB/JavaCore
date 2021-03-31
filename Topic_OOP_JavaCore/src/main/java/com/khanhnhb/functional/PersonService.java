package com.khanhnhb.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonService {
    private List<Person> people = List.of(
            new Person("A", Gender.FEMALE),
            new Person("B", Gender.MALE),
            new Person("C", Gender.FEMALE),
            new Person("D", Gender.MALE)
    );

    public void femaleList() {
        System.out.println("// Imperative approach");
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("// Declarative approach");
        final Predicate<Person> personPredicate = person -> person.getGender().equals(Gender.FEMALE);

        List<Person> females2 = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());

        females2.forEach(System.out::println);
    }
}
