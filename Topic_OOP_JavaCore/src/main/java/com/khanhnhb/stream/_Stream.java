package com.khanhnhb.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("KhanhNHB", 8, Gender.MALE),
                new Person("GiauTTN", 4, Gender.FEMALE),
                new Person("HanTHK", 5, Gender.FEMALE)
        );

        int sumAgeOfGenderFemale = getSumAgeOfGenderFemale(people);
        System.out.println(sumAgeOfGenderFemale);

//        getListFemale(people);
    }

    public static int getSumAgeOfGenderFemale(List<Person> people) {
        Predicate<Person> females = person -> person.getGender().equals(Gender.FEMALE);

        return people.stream().filter(females)
                .mapToInt(person -> person.getAge())
                .sum();
    }


    public static void getListFemale(List<Person> people) {
        people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
