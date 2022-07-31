package LECTURES.L03_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P06_HotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] children = scan.nextLine().split(" ");
        int numberOfTurns = Integer.parseInt(scan.nextLine());
        ArrayDeque<String> childrenQueue = new ArrayDeque<>();

        for (int i = 0; i < children.length; i++) {
            childrenQueue.offer(children[i]);
        }
        while(childrenQueue.size() != 1){
            for (int i = 1; i < numberOfTurns; i++) {
                String currentChild = childrenQueue.poll();
                childrenQueue.offer(currentChild);

            }
            String childToRemove = childrenQueue.poll();
            System.out.println("Removed " + childToRemove);
        }
        String lastChild = childrenQueue.peek();
        System.out.printf("Last is %s", lastChild);
    }
}
