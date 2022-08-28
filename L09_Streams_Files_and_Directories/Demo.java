package LECTURES.L09_Streams_Files_and_Directories;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {

        // read
    String path = "B:\\Java\\02_Courses\\03_Advance_Java\\" +
            "09_Streams_Files_and_Directories\\" +
            "Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        Scanner scan = new Scanner(inputStream);

        String line = scan.nextLine();

        while(scan.hasNextLine()){
            System.out.println(line);
            line = scan.nextLine();
        }
    }
}
