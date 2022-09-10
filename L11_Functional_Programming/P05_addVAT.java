package LECTURES.L11_Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class P05_addVAT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //UnaryOperator<Double>
        Function<Double, Double> addVAT = p -> p*1.2;

        Consumer<Double> printer = d -> System.out.printf("%.2f%n", d);

        System.out.println("Prices with VAT:");

        Arrays.stream(scan.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(addVAT)
                .forEach(printer);
    }
}
