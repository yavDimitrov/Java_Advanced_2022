package EXERCISES.LE12_Exerciuses_Functional_Programing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P05_Reverse_Exclude {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        int n = Integer.parseInt(scan.nextLine());

        Predicate<Integer> predicate = number -> number % n==0;

        numbers.removeIf(predicate);
        Collections.reverse(numbers);
        numbers.forEach(num -> System.out.print( num + " "));
    }
}
