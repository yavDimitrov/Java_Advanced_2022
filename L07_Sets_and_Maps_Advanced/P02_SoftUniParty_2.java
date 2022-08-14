package LECTURES.L07_Sets_and_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P02_SoftUniParty_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Set<String> guest = new TreeSet<>();

        String reservationNumber = scan.nextLine();

        while(!reservationNumber.equals("PARTY")){

            guest.add(reservationNumber);

                   reservationNumber  = scan.nextLine();
        }

        String guestReservation = scan.nextLine();

        while(!guestReservation.equals("END")){
            guest.remove(guestReservation);

            guestReservation = scan.nextLine();
        }
        System.out.println(guest.size());

        System.out.println(String.join(System.lineSeparator(), guest));

    }
}
