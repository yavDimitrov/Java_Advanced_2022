package EXERCISES.LE12_Exerciuses_Functional_Programing;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class P04_appliedArithmetic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        UnaryOperator<List<Integer>> addFunction = numbersList -> numbersList.stream().map(el -> el + 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtractFunction = numbersList -> numbersList.stream().map(el -> el - 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiplayFunction = numbersList -> numbersList.stream().map(el -> el * 2).collect(Collectors.toList());
        Consumer<Integer>printer = number -> System.out.printf("%d ", number);

        String input = scan.nextLine();

        while (!input.equals("end")) {
            switch (input) {
                case "add":
                    numbers = addFunction.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtractFunction.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiplayFunction.apply(numbers);
                    break;
                case "print":
                    numbers.forEach(printer);
                    System.out.println();
                    break;
//                default:
//                    System.out.println("No such command");
            }
            input = scan.nextLine();
        }

    }
}

