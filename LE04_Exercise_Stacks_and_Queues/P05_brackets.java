package EXERCISES.LE04_Exercise_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05_brackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String brakets = scan.nextLine();

        ArrayDeque<Character> openingBrakets = new ArrayDeque<>();
        boolean isBalanced = true;

        for (int i = 0; i < brakets.length(); i++) {
            char currentBracken = brakets.charAt(i);
            if (currentBracken == '{' || currentBracken == '(' || currentBracken == '[') {
                openingBrakets.push(currentBracken);
            } else {
                if(openingBrakets.isEmpty()){
                    isBalanced = false;
                    break;
                }
                char lastBracket = openingBrakets.pop();
                if (currentBracken == '}' && lastBracket != '{') {
                    isBalanced = false;
                    break;
                } else if (currentBracken == ')' && lastBracket != '(') {
                    isBalanced = false;
                    break;
                } else if (currentBracken == ']' && lastBracket != '[') {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (isBalanced && openingBrakets.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}