package EXERCISES.LE04_Exercise_Stacks_and_Queues;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P02_basicStackOperations_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] input = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                //.mapToInt(Integer::parseInt)
                .toArray();

        int countToPush = input[0];
        int countToPop = input[1];
        int elementToSearch = input[2];

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < countToPush; i++) {
            stack.push(numbers[i]);
        }
        for (int i = 0; i < countToPop; i++) {
            stack.pop();
        }
        if(stack.contains(elementToSearch)){
            System.out.println("true");
        } else if(stack.isEmpty()){
            System.out.println("0");
        } else {
         //   System.out.println(Collections.min(stack));
           // System.out.println(stack.stream().min(Integer::compare).get());
           // System.out.println(stack.stream().mapToInt(e->e).min().getAsInt());
            int minElement = Integer.MAX_VALUE;
            for (Integer number: stack ) {
                if(number < minElement){
                    minElement = number;
                }

            }
            System.out.println(minElement);
        }
    }
}
