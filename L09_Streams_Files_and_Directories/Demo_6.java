package LECTURES.L09_Streams_Files_and_Directories;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Properties;

public class Demo_6 {
    public static void main(String[] args) throws IOException {
        Properties properties = System.getProperties();
        //String programDir = System.getProperty("user.dir");
        String path = "src/LECTURES/L09_Streams_Files_and_Directories/input.txt";

        File myFile = new File("my-file.txt");

        if(!myFile.exists()){
            myFile.createNewFile();
        }


        System.out.println();
    }
}
