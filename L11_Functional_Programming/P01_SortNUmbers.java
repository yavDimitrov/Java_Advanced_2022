package LECTURES.L11_Functional_Programming;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_SortNUmbers {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);

            if (i == numbers.size() - 1) {
                System.out.print(number);
            } else {
                System.out.print(number + ", ");

            }

        }
    }
}

