package EXERCISES.LE04_Exercise_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P03_maxElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int [] command = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int commandType = command[0];

            switch(commandType){
                case 1:
                    stack.push(command[1]);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println(Collections.max(stack));
                    break;

            }
        }




    }
}
