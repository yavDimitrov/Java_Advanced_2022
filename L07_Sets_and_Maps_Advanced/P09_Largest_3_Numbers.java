package LECTURES.L07_Sets_and_Maps_Advanced;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09_Largest_3_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
