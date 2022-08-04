package LECTURES.L05_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class dEMO_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scan.nextLine());

        }

        int middleIndex = arr.length/2;

        int middleElenent = arr[middleIndex];

        System.out.println(middleElenent);

    }
}
