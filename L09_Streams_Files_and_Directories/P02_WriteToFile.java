package LECTURES.L09_Streams_Files_and_Directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class P02_WriteToFile {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        String path = "src/LECTURES/L09_Streams_Files_and_Directories/input.txt";

        try {
            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("src/LECTURES/L09_Streams_Files_and_Directories/output.txt");

            int read = inputStream.read();

            while (read != -1) {
               String output = Integer.toBinaryString(read) + " ";

                for (char c:output.toCharArray()) {
                    outputStream.write(c);

                }
                read = inputStream.read();
            }

        } catch(FileNotFoundException e){
            System.out.println("File not found " + e.getMessage());
        }catch (IOException ignored) {

        }
    }
}
