package LECTURES.L05_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class dEMO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int [] predefinedArr = new int[n];

        for (int i = 0; i < n; i++) {
            predefinedArr[i] = Integer.parseInt(scan.nextLine());

        }

        int [] arr = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

    }
}
