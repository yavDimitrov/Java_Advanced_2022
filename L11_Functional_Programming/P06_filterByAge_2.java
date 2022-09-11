package LECTURES.L11_Functional_Programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P06_filterByAge_2 {

    public static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Person> people = IntStream.range(0, n)
                .mapToObj(i -> readPerson(scan))
                .collect(Collectors.toList());


        String ageCondition = scan.nextLine();
        int ageFilter = Integer.parseInt(scan.nextLine());
        String outputFormat = scan.nextLine();

        people = filterByAgeCondition(people, getPredicate(ageCondition, ageFilter));

        Consumer<Person> printer = getPrinter(outputFormat);

        people.forEach(printer);
    }

    private static Consumer<Person> getPrinter(String outputFormat) {
        switch (outputFormat) {
            case "name":
                return p -> System.out.println(p.name);
            case "age":
                return p -> System.out.println(p.age);
            case "name age":
                return p -> System.out.println(p.name + " - " + p.age);
            default:
            throw new IllegalArgumentException("Unknown format " + outputFormat);

        }
    }

    public static Person readPerson (Scanner scan){
        String[] data = scan.nextLine().split(", ");

        String name = data[0];
        int age = Integer.parseInt(data[1]);

        return new Person(name, age);

    }



    private static Predicate<Person> getPredicate(String ageCondition, int ageFilter) {
        switch (ageCondition) {
            case "younger":
                return p -> p.age <= ageFilter;
            case "older":
                return p -> p.age >= ageFilter;
            default:
                throw new IllegalArgumentException("Invalid parameters for age predicate" + ageCondition + " " + ageFilter);
        }
    }

    public static List<Person> filterByAgeCondition(List<Person> people, Predicate<Person> predicate) {
        //Condition - "younger" or "older"
        return people.stream()
                .filter(predicate)
                .collect(Collectors.toList());

    }
}

