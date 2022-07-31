package LECTURES.L03_Stacks_and_Queues;

import com.sun.jdi.InconsistentDebugInfoException;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05_printerQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        ArrayDeque<String> files = new ArrayDeque<>();

        while(!input.equals("print")){
            if(input.equals("cancel")){
                if(files.isEmpty()){
                    System.out.println("Printer is on standby");
                } else {
                    String firstFileInQueue = files.poll();
                    System.out.printf("Canceled %s%n", firstFileInQueue);
                }

            } else {
                files.offer(input);
            }
            input = scan.nextLine();
        }
        for (String file: files) {
            System.out.println(file);
        }
    }
}
