package EXERCISES.LE12_Exerciuses_Functional_Programing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P09_listOfPredicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Integer> numbersToDivide = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());

        Predicate<Integer> isDivisable = number -> {
            for(Integer numberToDivide : numbersToDivide){
                if(number % numberToDivide != 0){
                    return false;
                }
            }
            return true;
        };

        for (int i = 1; i <= n; i++) {
            if(isDivisable.test(i)){
                System.out.print(i + " ");
            }

        }


    }
}
