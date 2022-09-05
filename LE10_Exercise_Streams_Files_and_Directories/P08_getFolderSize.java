package EXERCISES.LE10_Exercise_Streams_Files_and_Directories;


import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class P08_getFolderSize {
    public static void main(String[] args) throws IOException {


        File folder = new File("src/EXERCISES/LE10_Exercise_Streams_Files_and_Directories/Exercises Resources");
        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(folder);

        int sumBytes = 0;
        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();
            for (File f : Objects.requireNonNull(nestedFiles)) {
                if (f.isDirectory()) {
                    dirs.offer(f);
                } else {
                    sumBytes += f.length();
                }
            }
        }
        System.out.println("Folder size: " + sumBytes);
    }
}


