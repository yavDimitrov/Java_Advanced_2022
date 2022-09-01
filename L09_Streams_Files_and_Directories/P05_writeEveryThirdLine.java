package LECTURES.L09_Streams_Files_and_Directories;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class P05_writeEveryThirdLine {
    public static void main(String[] args) throws IOException {
        Properties properties = System.getProperties();
        //String programDir = System.getProperty("user.dir");
        String path = "src/LECTURES/L09_Streams_Files_and_Directories/input.txt";

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));

        BufferedWriter writer = new BufferedWriter(new FileWriter("src/LECTURES/L09_Streams_Files_and_Directories/every-third-Line-out.txt"));

        String line = reader.readLine();

        int counter = 0;

        while(line != null) {
            counter ++;

            if(counter % 3 == 0){
                writer.write(line);
                writer.newLine();
            }

            line = reader.readLine();
        }
        reader.close();
        writer.close();
    }
}
