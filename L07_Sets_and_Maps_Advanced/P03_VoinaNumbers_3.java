package LECTURES.L07_Sets_and_Maps_Advanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class P03_VoinaNumbers_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        
        /* String[] split = scan.nextLine().split("\\s+");

        Stream<String> stream = Arrays.stream(split);

        Stream<Integer> intStream = stream.map(Integer::parseInt);

        Set<Integer> firstDeck = intStream.collect(Collectors.toSet()); */

        Set<Integer> firstDeck = new LinkedHashSet<>();

        Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(() -> firstDeck));


    }
}
