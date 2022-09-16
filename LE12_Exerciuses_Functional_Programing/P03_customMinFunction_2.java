package EXERCISES.LE12_Exerciuses_Functional_Programing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P03_customMinFunction_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();


        Function<int [], Integer> smallestInt = (int[] arr) -> {
        int min = Integer.MAX_VALUE;

        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        return min;
            };

        Function<int[], Integer> function = arr -> Arrays.stream(arr).min().getAsInt();       // polzwa INGEGERS
        Function<int[], Integer> func = arr -> Collections.min(Arrays.stream(arr).boxed().collect(Collectors.toList())); // polzwa int int int



        

        System.out.println(smallestInt.apply(numbers));
    }
}
