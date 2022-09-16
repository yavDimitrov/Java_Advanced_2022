package EXERCISES.LE12_Exerciuses_Functional_Programing;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P03_customMinFunction {
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

        System.out.println(smallestInt.apply(numbers));
    }



    public static int minNumber (int[] arr){
        int min = Integer.MAX_VALUE;

        for (int element: arr) {
            if(element < min){
                min = element;
            }
        }
        return min;

    }
}
