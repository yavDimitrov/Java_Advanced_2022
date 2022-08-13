package LECTURES.L07_Sets_and_Maps_Advanced;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01_Parking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> cars = new LinkedHashSet<>();

        String input = scan.nextLine();

        while(!input.equals("END")){
            String [] tokens = input.split(", ");

            String direction = tokens[0];
            String carRegistrations = tokens[1];

            if(direction.equals("IN")){
                cars.add(carRegistrations);
            } else {
                cars.remove(carRegistrations);
            }


            input = scan.nextLine();
        }

        if(cars.isEmpty()){
            System.out.println("Parking Lot is Empty");

        }else{
            System.out.println(String.join(System.lineSeparator(), cars));

        }
    }
}
