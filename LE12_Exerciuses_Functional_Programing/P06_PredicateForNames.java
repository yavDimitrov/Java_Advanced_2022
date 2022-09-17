package EXERCISES.LE12_Exerciuses_Functional_Programing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P06_PredicateForNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nameLenght = Integer.parseInt(scan.nextLine());

        List<String> names = Arrays.stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Predicate<String> predicate = name -> name.length() <= nameLenght;

        names.stream().filter(predicate).forEach(System.out::println);

    }
}
