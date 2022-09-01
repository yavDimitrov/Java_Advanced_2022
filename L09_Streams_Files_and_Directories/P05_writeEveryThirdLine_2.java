package LECTURES.L09_Streams_Files_and_Directories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Properties;

public class P05_writeEveryThirdLine_2 {
    public static void main(String[] args) throws IOException {
        Properties properties = System.getProperties();
        //String programDir = System.getProperty("user.dir");
        String path = "src/LECTURES/L09_Streams_Files_and_Directories/input.txt";

        List<String> strings = Files.readAllLines(Paths.get(path));

        for (int i = 2; i < strings.size(); i+=3) {
            System.out.println(strings.get(i));
        }
        Files.write(Path.of("my-demo"), strings, StandardOpenOption.APPEND);
    }
}
