package EXERCISES.LE10_Exercise_Streams_Files_and_Directories;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class P01_sumLines {
    public static void main(String[] args) throws IOException {


         {
                Path inPath = Paths.get("src/EXERCISES/LE10_Exercise_Streams_Files_and_Directories/input.txt");
                BufferedReader reader = Files.newBufferedReader(inPath);

                String line;
                while ((line = reader.readLine()) != null) {
                    int sum = 0;
                    for (int i = 0; i < line.length(); i++) {
                        sum += line.charAt(i);
                    }
                    System.out.println(sum);
                }
            }
        }
    }

