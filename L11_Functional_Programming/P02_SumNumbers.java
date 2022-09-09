package LECTURES.L11_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P02_SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


//        Count = 10
//        Sum = 41

        //System.out.println("Count = " + numbers.size());

        Function<List<Integer>, String> countFormatter = list -> "Count = " + list.size();

        Function<List<Integer>, Integer> sumAllElements = l -> l.stream().mapToInt(e ->e).sum();

        Function<Integer, String> sumFormatter = s -> "Sum = " + s;

        String countOutput = countFormatter.apply(numbers);

        System.out.println(countOutput);

        int sum = sumAllElements.apply(numbers);
        String sumOutput = sumFormatter.apply(sum);

        System.out.println(sumOutput);
    }
}
