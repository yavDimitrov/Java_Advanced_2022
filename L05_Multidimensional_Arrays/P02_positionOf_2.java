package LECTURES.L05_Multidimensional_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class P02_positionOf_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = Utils_J_05.readMatrix2D(scan);

        int number = (Integer.parseInt(scan.nextLine()));

        ArrayList<String> output = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == number) {
                    output.add(row + " " + col);
                }

            }

        }

        String outPut = formatOutput(output);

        System.out.println(outPut);


    }

    private static String formatOutput(ArrayList<String> output) {

        return output.isEmpty() ? "not found" : String.join(System.lineSeparator(), output);
    }
}
