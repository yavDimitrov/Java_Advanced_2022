package EXERCISES.LE10_Exercise_Streams_Files_and_Directories;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class P02_sumBytes {
    public static void main(String[] args) throws IOException {


        Path inPath = Paths.get("src/EXERCISES/LE10_Exercise_Streams_Files_and_Directories/input.txt");
        BufferedReader reader = Files.newBufferedReader(inPath);

        String line;
        long sum = 0;
        while ((line = reader.readLine()) != null) {
            for (char c : line.toCharArray()) {
                sum += c;
            }
        }
        System.out.println(sum);
    }
}