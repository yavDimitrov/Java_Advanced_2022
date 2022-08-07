package LECTURES.L05_Multidimensional_Arrays;

import java.util.Scanner;

public class P03_intersectionOf2Matrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());

        char[][] first = new char [rows][cols];
        char[][] second = new char [rows][cols];

        for (int row = 0; row < rows; row++) {
            first[row] = scan.nextLine()
                    .replaceAll("\\s+", "")
                    .toCharArray();

        }
        for (int row = 0; row < rows; row++) {
            second[row] = scan.nextLine()
                    .replaceAll("\\s+", "")
                    .toCharArray();

        }

        char[][] output = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char firstElement = first[row][col];
                char secondElement = second[row][col];
                char fillChar = firstElement == secondElement ? firstElement : '*';
                output[row][col] = fillChar;


            }

        }
        for (char[] chars : output) {
            for (char c : chars) {
                System.out.print(c + " ");
            }
            System.out.println();
            
        }
    }
}
