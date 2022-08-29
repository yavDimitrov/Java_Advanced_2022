package LECTURES.L09_Streams_Files_and_Directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo_5 {
    public static void main(String[] args) {

        // read
        String path = "B:\\Java\\02_Courses\\03_Advance_Java\\" +
                "09_Streams_Files_and_Directories\\" +
                "Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        String numberAsString = "13a";

        try {
            int n = Integer.parseInt(numberAsString);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number" + e.getMessage());

        }


    }
}
