package LECTURES.L03_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class demo_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] tokens = scan.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>(); //Push, Pop, Peek

        //
        Arrays.stream(tokens).forEach(stack::push);
        //ДВАТА РЕДА СА ЕДНАКВИ
        Arrays.stream(tokens).forEach(t -> stack.push(t));

    }
}
