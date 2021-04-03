package com.khanhnhb.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        /**
         * TODO: Function - Takes 1 argument and produces 1 result
         *
         * int resultIncrement = increment(1);
         *         System.out.println(resultIncrement);
         *
         *         Function<Integer, Integer> incrementThenMultiply = incrementByFunction.andThen(multiplyByFunction);
         *         Function<Integer, Integer> multiplyBeforeIncrement = incrementThenMultiply.compose(multiplyByFunction);
         *
         *         int resultIncrementThenMultiply = incrementThenMultiply.apply(1);
         *         System.out.println(resultIncrementThenMultiply);
         *
         *         int resultMultiplyBeforeIncrement = multiplyBeforeIncrement.apply(1);
         *         System.out.println(resultMultiplyBeforeIncrement);
         *
         *         List<Person> people = Arrays.asList(
         *                 new Person("Khanh", Gender.MALE),
         *                 new Person("Giau", Gender.FEMALE),
         *                 new Person("Han", Gender.FEMALE)
         *         );
         *
         *         System.out.println("// Function identity");
         *         people.stream()
         *                 .map(Function.identity())
         *                 .forEach(System.out::println);
         *
         *         System.out.println("// Function person -> person");
         *         people.stream()
         *                 .map(person -> person)
         *                 .forEach(System.out::println);
         */

        /**
         * TODO: BiFunction - Takes 2 argument and produces 1 result
         */

//        incrementAndMultiplyBiFunction.apply(4, 100.0);
//        System.out.println(resultIncrementAndMultiplyBiFunction);
//        int resultIncrementAndMultiplyBiFunction =

        BiFunction<Integer, Integer, Double> incrementAndMultiplyBiFunctionThenDecrementAndDivideByBiFunction
                = incrementAndMultiplyBiFunction.andThen(decrementAndDivideByBiFunction);


        double resultIncrementAndMultiplyBiFunctionThenDecrementAndDivideByBiFunction
                = incrementAndMultiplyBiFunctionThenDecrementAndDivideByBiFunction.apply(4, 100);
        System.out.println(resultIncrementAndMultiplyBiFunctionThenDecrementAndDivideByBiFunction);
    }

    static int increment(int number) {
        return number + 1;
    }

    static java.util.function.Function<Integer, Integer> incrementByFunction = number -> number + 1;

    static java.util.function.Function<Integer, Integer> multiplyByFunction = number -> number * 2;

    static BiFunction<Integer, Integer, Integer> incrementAndMultiplyBiFunction =
            (increment, multiply) -> (increment + 1) * multiply;

    static java.util.function.Function<Integer, Double> decrementAndDivideByBiFunction =
            number -> Double.valueOf((number - 1) / 2);
}
