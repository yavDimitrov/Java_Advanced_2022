package LECTURES.L07_Sets_and_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Set<String> vip = new LinkedHashSet<>();
        Set<String> regular = new LinkedHashSet<>();

        String reservationNumber = scan.nextLine();

        while(!reservationNumber.equals("PARTY")){
            char startingSymbol = reservationNumber.charAt(0);

            boolean isVipRegistration = Character.isDigit(startingSymbol);
            if(isVipRegistration){
                vip.add(reservationNumber);
            } else {
                regular.add(reservationNumber);
            }

                   reservationNumber  = scan.nextLine();
        }

        String guestReservation = scan.nextLine();

        while(!guestReservation.equals("END")){
            vip.remove(guestReservation);
            regular.remove(guestReservation);

            guestReservation = scan.nextLine();
        }
        System.out.println(vip.size() + regular.size());

        System.out.println(String.join(System.lineSeparator(), vip));
        System.out.println(String.join(System.lineSeparator(), regular));

    }
}
