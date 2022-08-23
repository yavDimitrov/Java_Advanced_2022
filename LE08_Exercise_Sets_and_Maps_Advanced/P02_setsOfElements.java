package EXERCISES.LE08_Exercise_Sets_and_Maps_Advanced;

import com.sun.source.tree.DirectiveTree;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Stream;

public class P02_setsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] intSizes = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstSetSize = intSizes[0];
        LinkedHashSet<String> firstSet = new LinkedHashSet<>();

        for (int i = 0; i < firstSetSize; i++) {
            firstSet.add(scan.nextLine());
        }

        int secondSetSize = intSizes[1];
        LinkedHashSet<String> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < secondSetSize; i++) {
            secondSet.add(scan.nextLine());

        }
        firstSet.retainAll(secondSet);

        for (String el : firstSet) {
            System.out.print(el + " ");
        }
        System.out.println(String.join(" ", firstSet));
    }
}
