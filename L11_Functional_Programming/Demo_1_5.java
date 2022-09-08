package LECTURES.L11_Functional_Programming;

import java.io.IOException;
import java.util.Arrays;

public class Demo_1_5 {
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

        Arrays.stream(arr)
                .mapToDouble(n -> Math.pow(n, pow))
                                .forEach(System.out::println);

    //    () -> System.out.println("Hello");

     /*   for (int number : arr) {
            double powerOf = getPowerOf(number, pow);
            System.out.println(powerOf);
        } */

        new Thread(() -> System.out.println("Hello")).run();

        
    }

}
