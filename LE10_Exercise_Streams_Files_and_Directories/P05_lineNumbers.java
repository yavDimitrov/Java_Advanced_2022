package EXERCISES.LE10_Exercise_Streams_Files_and_Directories;

import java.io.*;

public class P05_lineNumbers {
    public static void main(String[] args) throws IOException {


        String inPath = "src/EXERCISES/LE10_Exercise_Streams_Files_and_Directories/inputLineNumbers.txt";
        String outputPath = "src/EXERCISES/LE10_Exercise_Streams_Files_and_Directories/outputLineNumbers.txt";

        BufferedReader reader = new BufferedReader(new FileReader(inPath));
        PrintWriter writer = new PrintWriter(new FileWriter(outputPath));

        String line;
        int count = 1;
        while ((line = reader.readLine()) != null) {
            writer.println(count + ". " + line);
            count++;
        }
        writer.close();
    }
}

