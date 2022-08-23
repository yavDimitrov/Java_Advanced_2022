package EXERCISES.LE08_Exercise_Sets_and_Maps_Advanced;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class P03_periodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfCompounds = Integer.parseInt(scan.nextLine());

        TreeSet<String> elements = new TreeSet<>();


        for (int i = 0; i < numberOfCompounds; i++) {

            String[] elementsInput = scan.nextLine().split("\\s+");

            Collections.addAll(elements, elementsInput);

        }

        String result = String.join(" ",elements);
        System.out.println(result);
    }
}
