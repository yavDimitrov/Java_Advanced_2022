package EXERCISES.LE06_Exercise_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04_maximumSUM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] matrixSize = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = matrixSize[0];
        int cols = matrixSize[1];

        int [][] matrix = new int [rows][cols];

        for (int row = 0; row < rows; row++) {
            int [] singleRow = Arrays.stream(scan.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = singleRow;


        }

        int maxSum = Integer.MIN_VALUE;
        int besrStartingRow = -1;
        int bestStartCol = -1;

        for (int row = 0; row < rows -2; row++) {
            for (int col = 0; col < cols -2; col++) {
                int sum = matrix[row][col] + matrix[row][col +1] + matrix[row][col +2]
                        +matrix[row+1][col] + matrix[row+1][col +1] + matrix[row+1][col +2]
                        +matrix[row+2][col] + matrix[row+2][col +1] + matrix[row+2][col +2];

                if(sum > maxSum){
                    maxSum = sum;
                    besrStartingRow = row;
                    bestStartCol = col;
                }


            }

        }
        System.out.printf("Sum = %d%n", maxSum);
        for (int row = besrStartingRow; row < besrStartingRow + 3 ; row++) {
            for (int col = bestStartCol; col < bestStartCol + 3; col++) {
                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();

        }

    }
}
