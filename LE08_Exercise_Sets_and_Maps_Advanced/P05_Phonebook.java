package EXERCISES.LE08_Exercise_Sets_and_Maps_Advanced;

import java.util.HashMap;
import java.util.Scanner;

public class P05_Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<String, String> phonebook = new HashMap<>();

        String input = scan.nextLine();

        while(!input.equals("search")){
            String[] inputTokens = input.split("-");
            String name = inputTokens[0];
            String phoneNumber = inputTokens[1];

            phonebook.put(name, phoneNumber);

            input = scan.nextLine();

        }

        input = scan.nextLine();

        while(!input.equals("stop")){
            if(phonebook.containsKey(input)){
                System.out.printf("%s -> %s%n", input, phonebook.get(input));
            } else {
                System.out.printf("Contact %s does not exist.%n", input);
            }

            input = scan.nextLine();
        }
    }
}
