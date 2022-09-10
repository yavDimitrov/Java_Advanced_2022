package LECTURES.L11_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P04_countUpperCaseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Predicate<String> startsWithUppercase = w -> Character.isUpperCase(w.charAt(0));

        List<String> uppercaseWords = Arrays.stream(scan.nextLine().split("\\s+"))
                .filter(startsWithUppercase)
                .collect(Collectors.toList());

        System.out.println(uppercaseWords.size());

        System.out.println(String.join(System.lineSeparator(), uppercaseWords));

    }
}
