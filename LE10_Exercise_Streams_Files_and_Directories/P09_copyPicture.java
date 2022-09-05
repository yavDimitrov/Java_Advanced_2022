package EXERCISES.LE10_Exercise_Streams_Files_and_Directories;

import java.io.*;

public class P09_copyPicture {
    public static void main(String[] args) throws IOException {


        String inPath = "src/EXERCISES/LE10_Exercise_Streams_Files_and_Directories/picture.jpg";
        String outputPath = "src/EXERCISES/LE10_Exercise_Streams_Files_and_Directories/picture-copy.jpg";

        InputStream in = new FileInputStream(inPath);
        OutputStream out = new FileOutputStream(outputPath);

        byte[] allBytes = in.readAllBytes();
        out.write(allBytes);
    }
}

