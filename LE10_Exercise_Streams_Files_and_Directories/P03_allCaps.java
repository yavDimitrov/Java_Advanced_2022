package EXERCISES.LE10_Exercise_Streams_Files_and_Directories;

import java.io.*;

public class P03_allCaps {
    public static void main(String[] args) throws IOException {


        String inPath = "src/EXERCISES/LE10_Exercise_Streams_Files_and_Directories/input.txt";
        String outputPath = "src/EXERCISES/LE10_Exercise_Streams_Files_and_Directories/output.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inPath));
        PrintWriter writer = new PrintWriter(new FileWriter(outputPath));

        String line;
        while ((line = reader.readLine()) != null) {
            line = line.toUpperCase();
            writer.println(line);
        }
        writer.close();
    }
}
