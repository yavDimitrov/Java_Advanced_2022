package LECTURES.L03_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] input = scan.nextLine().split("\\s+");
        ArrayDeque<String> tokens = new ArrayDeque<>();
        Collections.addAll(tokens, input);

        while (tokens.size()>1){
            int firstNumber = Integer.parseInt(tokens.pop());
            String operator = tokens.pop();
            int secondNumber = Integer.parseInt(tokens.pop());
            int result = 0;
            if(operator.equals("+")){
                result = firstNumber + secondNumber;
                } else {
                result = firstNumber - secondNumber;
            }
            tokens.push(String.valueOf(result));
        }
        System.out.println(tokens.peek());
    }
}
