package com.khanhnhb.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _Compare {

    public static void main(String[] args) {
//        List<Student> students = List.of(
//                new Student(1, "Khanh", 8),
//                new Student(2, "Giau", 3),
//                new Student(3, "Han", 6)
//        );

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Khanh", 8));
        students.add(new Student(2, "Giau", 3));
        students.add(new Student(3, "Han", 6));

//        students.stream().sorted(Student::compareTo).forEach(System.out::println);

        displayComparator(students, new NameComparator());
        System.out.println(students);
    }

    public static void displayComparable(List<Student> students) {
        Collections.sort(students);
    }

    public static void displayComparator(List<Student> students, NameComparator nameComparator) {
        Collections.sort(students, nameComparator);
    }
}
