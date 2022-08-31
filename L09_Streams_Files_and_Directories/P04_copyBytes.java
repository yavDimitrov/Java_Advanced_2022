package LECTURES.L09_Streams_Files_and_Directories;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class P04_copyBytes {
    public static void main(String[] args) throws IOException {
        Properties properties = System.getProperties();
        //String programDir = System.getProperty("user.dir");
        String path = "src/LECTURES/L09_Streams_Files_and_Directories/input.txt";

            FileInputStream fileInputStream = new FileInputStream(path);

            Scanner scan = new Scanner(fileInputStream);

            PrintWriter writer = new PrintWriter(new FileOutputStream("src/LECTURES/L09_Streams_Files_and_Directories/integers-out.txt"));

            while (scan.hasNext()){
                if(scan.hasNextInt()){
                    writer.println(scan.next());
                } else {
                    scan.next();
                }
            }
            writer.close();

    }
}
