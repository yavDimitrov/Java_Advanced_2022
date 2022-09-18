package EXERCISES.LE12_Exerciuses_Functional_Programing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P07_findTheSmallestOne_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());



        Function<List<Integer>, Integer> minElementIndex = integerList -> {
            int minElement = integerList.stream().mapToInt(e -> e).min().getAsInt();
            return integerList.lastIndexOf(minElement);
        };

        System.out.println(minElementIndex.apply(list));
    }

    public static Integer minElemIndex(List<Integer> IntegerList) {
        int minElement = Integer.MIN_VALUE;
        int minIndex = -1;
        for (int i = 0; i < IntegerList.size(); i++) {
            if (IntegerList.get(i) <= minElement) {
                minElement = IntegerList.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }
}
