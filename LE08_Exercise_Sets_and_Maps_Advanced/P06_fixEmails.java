package EXERCISES.LE08_Exercise_Sets_and_Maps_Advanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06_fixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        LinkedHashMap<String, String> emails = new LinkedHashMap<>();
        while(!name.equals("stop")){
            String email = scan.nextLine();
            if(!email.endsWith(".us") && !email.endsWith(".uk") && !email.endsWith(".com")){
                emails.put(name, email);
            }


            name = scan.nextLine();
        }
        for (var personAndEmail : emails.entrySet()) {
            System.out.printf("%s -> %s%n", personAndEmail.getKey(), personAndEmail.getValue());
        }


    }
}
