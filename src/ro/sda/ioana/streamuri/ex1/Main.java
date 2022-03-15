package ro.sda.ioana.streamuri.ex1;

import java.util.*;

public class Main {
    private static final List<String> NAMES = new ArrayList<>();

    static {
        NAMES.add("George");
        NAMES.add("Marian");
        NAMES.add("Marius");
        NAMES.add("Mihai");
        NAMES.add("Alex");
    }

    private static final List<Integer> NUMBERS = Arrays.asList(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);


    public static void main(String[] args) {

        NAMES.stream()
                .sorted()
                .forEach(name -> System.out.println(name)); //((System.out:println)
        System.out.println("=================================");

        NUMBERS.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("=================================");

        NAMES.stream()
                .filter(name -> name.startsWith("M"))
                .forEach(System.out::println);
        System.out.println("=================================");

        NUMBERS.stream()
                .filter(number -> number > 30 && number <= 200)
                .forEach(System.out::println);
        System.out.println("=================================");

        NAMES.stream()
                .map(name -> name.toUpperCase(Locale.ROOT))
                .forEach(System.out::println);
        System.out.println("=================================");

        NAMES.stream()
                .map(name -> name.substring(1, name.length() - 1))
                .forEach(System.out::println);

        NUMBERS.stream()
//                .sorted((number2, number1) -> number1.compareTo(number2))
                .filter(number -> !number.equals(0))
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println("=================================");

        NUMBERS.stream()
                .filter(number -> number.equals(50))
                .findAny()
                .ifPresent(number -> System.out.println(number));
        System.out.println("=================================");
        boolean exists = NUMBERS.stream()
                .anyMatch(number -> number.equals(50));
        System.out.println(exists);

    }


}
