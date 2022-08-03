package EXERCISES.LE04_Exercise_Stacks_and_Queues;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P06_recursiveFibonaci {
    public static long[] memory;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        memory = new long[n+1];
        if(n ==0){
            System.out.println(0);
            return;
        }
        long result = fib(n);
        System.out.println(result);
    }
    private   static long fib(int n){
        if(n<2){
            return 1;
        }
        if (memory[n] != 0) {
            return memory[n];
        }
        memory[n]= fib(n-1) + fib(n -2);
        return memory[n];
    }
}
;
