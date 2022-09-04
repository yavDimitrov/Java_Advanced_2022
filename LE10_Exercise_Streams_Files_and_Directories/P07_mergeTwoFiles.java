package EXERCISES.LE10_Exercise_Streams_Files_and_Directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class P07_mergeTwoFiles {
    public static void main(String[] args) throws IOException {


        Path inputOne = Paths.get("src/EXERCISES/LE10_Exercise_Streams_Files_and_Directories/inputOne.txt");
        Path inputTwo = Paths.get("src/EXERCISES/LE10_Exercise_Streams_Files_and_Directories/inputTwo.txt");
        Path result = Paths.get("src/EXERCISES/LE10_Exercise_Streams_Files_and_Directories/result.txt");

        List<String> linesInFiles = new ArrayList<>();
        linesInFiles.addAll(Files.readAllLines(inputOne));
        linesInFiles.addAll(Files.readAllLines(inputTwo));
        Files.write(result, linesInFiles);
    }
}
