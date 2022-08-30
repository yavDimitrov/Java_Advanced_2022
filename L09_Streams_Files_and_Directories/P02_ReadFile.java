package LECTURES.L09_Streams_Files_and_Directories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P02_ReadFile {
    public static void main(String[] args) {

        String path = "input.txt";

        try {
            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("output.txt");

            int read = inputStream.read();

            while (read != -1) {
                outputStream.write(read);
                System.out.print(Integer.toBinaryString(read) + " ");
                read = inputStream.read();

            }

        } catch (IOException ignored) {

        }
    }
}
