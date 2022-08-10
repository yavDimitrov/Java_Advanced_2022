package LECTURES.L05_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Utils_J_05 {

    public static int [][] readMatrix2D(Scanner scan) {
        String [] dimensions = scan.nextLine().split("\\s+");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int [][] matrinx = new int [rows][cols];

        for (int row = 0; row < rows; row++) {
            int [] arr = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrinx[row] = arr;
        }
        return matrinx;
    }

    public static void printMatrix(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            int[] arr = matrix[row];
            for (int  n : arr) {
                System.out.print(n + " ");

            }
            System.out.println();

        }
    }
    public static void printMatrixUPDATE(int[][] matrix) {

        for (int[] arr : matrix) {
            for (int  n : arr) {
                System.out.print(n + " ");

            }
            System.out.println();

        }
    }
}
