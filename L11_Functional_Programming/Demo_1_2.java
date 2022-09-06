package LECTURES.L11_Functional_Programming;

import java.io.IOException;

public class Demo_1_2 {
    public static void main(String[] args) throws IOException {

        //Method:
        //return type -> double
        // name -> getPowerOf
        // parameters list -> (int x, int pow)
        // signature -> getPowerOf(int, int)
        // body -> {return Math.pow(x, pow);}

        //Read numebrs arr[] from consolle on a line
        //Read number pow
        //Raise and print all numbers from arr[] to pow

        int [] arr = {13, 42, 69, 73};
        int pow = 2;

        for (int number : arr) {
            double powerOf = getPowerOf(number, pow);
            System.out.println(powerOf);
        }

        
    }
    public static double getPowerOf(int x, int pow){

        return Math.pow(x, pow);
    }
}
