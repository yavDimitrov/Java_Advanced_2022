package LECTURES.L09_Streams_Files_and_Directories;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class P03_CopyBitys {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        String path = "src/LECTURES/L09_Streams_Files_and_Directories/input.txt";

        try {
            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("src/LECTURES/L09_Streams_Files_and_Directories/output_3.txt");

            int read = inputStream.read();

            PrintWriter writer = new PrintWriter(outputStream);

            while (read != -1) {

                if (read == ' ') {
                    writer.print(' ');
                } else if (read == 10) {
                    writer.println();
                } else {
                    writer.print(read);
                }
                read = inputStream.read();
            }
            writer.close();
          //  writer.flush(); chisti potoka of buffernata pamet

        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } catch (IOException ignored) {

        }
    }
}
