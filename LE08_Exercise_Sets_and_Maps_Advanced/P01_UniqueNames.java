package EXERCISES.LE08_Exercise_Sets_and_Maps_Advanced;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01_UniqueNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numberOfUsernames = Integer.parseInt(scan.nextLine());

        Set<String> usernames = new LinkedHashSet<>();

        for (int i = 0; i < numberOfUsernames; i++) {
            String input = scan.nextLine();
            usernames.add(input);
        }

        for (String username : usernames) {

            System.out.println(username);

        }
        // usernames.forEach(System.out::println);
        // usernames.forEach(username -> System.out.println(username));

    }
}
