package EXERCISES.LE04_Exercise_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DEMO_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque <Integer> stack = new ArrayDeque<>(); //LIFO
        stack.push(9);
        stack.push(34);
        stack.push(98);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.size();
        // stack.isEmpty() -> size == 0 -> true  size != 0 -> false
               //  stack.contains()

            ArrayDeque <Integer> queue = new ArrayDeque<>(3); // FIFP first in first out
            queue.offer(5); // ако е пълна опашката връща false
            queue.offer(67);
            queue.add(100); // ако е пълна опашката връща exception - грешка в програмата
            queue.poll(); // премахва първия елемент
            System.out.println(queue.poll());
            System.out.println(queue.peek());

    }
}
