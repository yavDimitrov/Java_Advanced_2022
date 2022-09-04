package EXERCISES.LE10_Exercise_Streams_Files_and_Directories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class P06_wordCount {
    public static void main(String[] args) throws IOException {


        Path words = Paths.get("src/EXERCISES/LE10_Exercise_Streams_Files_and_Directories/words.txt");
        Path text = Paths.get("src/EXERCISES/LE10_Exercise_Streams_Files_and_Directories/text.txt");
        String results = "src/EXERCISES/LE10_Exercise_Streams_Files_and_Directories/results.txt";

        PrintWriter writer = new PrintWriter(new FileWriter(results));
        Map<String, Integer> wordsInFile = new HashMap<>();
        Arrays.stream(Files.readString(words).split("\\s+")).forEach(s -> wordsInFile.put(s, 0));
        Arrays.stream(Files.readString(text).split("\\s+"))
                .forEach(s -> {
                    if (wordsInFile.containsKey(s)) {
                        wordsInFile.put(s, wordsInFile.get(s) + 1);
                    }
                });
        wordsInFile.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(s -> writer.println(s.getKey() + " - " + s.getValue()));
        writer.close();
    }
}

