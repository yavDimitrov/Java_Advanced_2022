package LECTURES.L09_Streams_Files_and_Directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo_3 {
    public static void main(String[] args) {

        // read
    String path = "B:\\Java\\02_Courses\\03_Advance_Java\\" +
            "09_Streams_Files_and_Directories\\" +
            "Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";


        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            System.out.println("File was found and it's OK");
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } finally {
           // fileInputStream.close();
        }
    }
}
