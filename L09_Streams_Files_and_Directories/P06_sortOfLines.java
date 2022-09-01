package LECTURES.L09_Streams_Files_and_Directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class P06_sortOfLines {
    public static void main(String[] args) throws IOException {
        Properties properties = System.getProperties();
        //String programDir = System.getProperty("user.dir");
        String path = "src/LECTURES/L09_Streams_Files_and_Directories/input.txt";

        List<String> sortedLines = Files.readAllLines(Paths.get(path))
                .stream().sorted().collect(Collectors.toList());

        Path outputPath = Path.of("src/LECTURES/L09_Streams_Files_and_Directories/sorted-lines-out.txt");

        if(!Files.exists(Path.of("src/LECTURES/L09_Streams_Files_and_Directories/sorted-lines-out.txt"))){
            Files.createFile(Path.of("src/LECTURES/L09_Streams_Files_and_Directories/sorted-lines-out.txt"));
        }

        Path write = Files.write(outputPath, sortedLines);

    }
}
