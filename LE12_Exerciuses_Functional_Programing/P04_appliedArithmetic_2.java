package EXERCISES.LE12_Exerciuses_Functional_Programing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class P04_appliedArithmetic_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Integer[] arr = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new); // Масиве от интегери


    }
}

