package LECTURES.L05_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P01_CompareMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [][] firstMatrix = readMatrix(scan);
        int [][] secondMatrix = readMatrix(scan);

        boolean areEqual = compareMatrices(firstMatrix, secondMatrix);

        if(Arrays.deepEquals(firstMatrix, secondMatrix)){
            System.out.println("equals");
        }


        //printMatrix(firstMatrix);
       //printMatrix(secondMatrix);

        String output = areEqual ? "true": "not true";
        System.out.println(output);


    }

    private static boolean compareMatrices(int[][] firstMatrix, int[][] secondMatrix) {

        if(firstMatrix.length != secondMatrix.length){
            return false;
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            int [] firstArr = firstMatrix[row];
            int [] secondArr = secondMatrix[row];
            if(firstArr.length != secondArr.length){
                return false;
            }

            for (int col = 0; col < firstArr.length; col++) {
                int firstElement = firstArr[col];
                int secondElement = secondArr[col];

                if(firstElement != secondElement){
                    return false;
                }

            }

        }
        return true;
    }

    private static int [][] readMatrix(Scanner scan) {
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

    private static void printMatrix(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            int[] arr = matrix[row];
            for (int  n : arr) {
                System.out.print(n + " ");

            }
            System.out.println();

        }
    }
    private static void printMatrixUPDATE(int[][] matrix) {

        for (int[] arr : matrix) {
            for (int  n : arr) {
                System.out.print(n + " ");

            }
            System.out.println();

        }
    }
}
