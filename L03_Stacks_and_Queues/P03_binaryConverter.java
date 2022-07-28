package LECTURES.L03_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03_binaryConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int decimal = Integer.parseInt(scan.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while(decimal != 0 ){
            int leftover = decimal % 2;
            stack.push(leftover);
            decimal = decimal / 2;
        }

        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            System.out.println(stack.pop());
        }

    }
}
