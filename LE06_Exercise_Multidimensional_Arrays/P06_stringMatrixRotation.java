package EXERCISES.LE06_Exercise_Multidimensional_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// left -> right = col --;
// right -> left = col ++;
// up = row --;
// down = row ++;


public class P06_stringMatrixRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String rotationInput = scan.nextLine();

        String input = scan.nextLine();
        List<String> wordList = new ArrayList<>();

        int maxColomnLenght = Integer.MIN_VALUE;
        while (!input.equals("END")) {
            int currentLenght = input.length();

            if (currentLenght > maxColomnLenght) {
                maxColomnLenght = currentLenght;
            }
            wordList.add(input);

            input = scan.nextLine();
        }

        int rows = wordList.size();
        int cols = maxColomnLenght;

        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            String currentWord = wordList.get(row);
            for (int col = 0; col < cols; col++) {
                if (col < currentWord.length()) {
                    char currentChar = currentWord.charAt(col);
                    matrix[row][col] = currentChar;
                } else {
                    matrix[row][col] = ' ';
                }

            }

        }
        String angleString = rotationInput.split("[()]")[1];
        int angle = Integer.parseInt(angleString);
        int angleOfRotation = angle % 360;

        printMatrix(matrix, rows, cols, angleOfRotation);


    }

    private static void printMatrix(char[][] matrix, int rows, int cols, int angleOfRotation) {

        switch (angleOfRotation){
            case 0:
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col]);

                    }
                    System.out.println();
                }
                break;
            case 90:
                for (int col = 0; col < cols; col++) {
                    for (int row = rows-1; row >= 0 ; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();

                }
                break;
            case 180:
                for (int row = rows -1 ; row >= 0 ; row--) {
                    for (int col = cols -1; col >= 0 ; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                    
                }
                break;
            case 270:
                for (int col = cols -1 ; col >= 0 ; col--) {
                    for (int row = 0; row < rows; row++) {
                        System.out.print(matrix[row][col]);

                    }
                    System.out.println();
                }
                break;
        }
    }
}
