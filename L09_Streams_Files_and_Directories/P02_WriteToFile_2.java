package LECTURES.L09_Streams_Files_and_Directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class P02_WriteToFile_2 {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        String path = "src/LECTURES/L09_Streams_Files_and_Directories/input.txt";

        try {
            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("src/LECTURES/L09_Streams_Files_and_Directories/output_2.txt");

            int read = inputStream.read();

            //  ",", ".", "!", "?".

            while (read != -1) {

              //char symbol = (char)read; ne e nujno
                //read !=',' && read !='.' && read !='!' && read !='?'

                Set<Character> ponctuations = Set.of(',', '.', '!', '?');

              if(!ponctuations.contains((char)read)){

                  outputStream.write(read);

              }
                  read = inputStream.read();

            }

        } catch(FileNotFoundException e){
            System.out.println("File not found " + e.getMessage());
        }catch (IOException ignored) {

        }
    }
}
