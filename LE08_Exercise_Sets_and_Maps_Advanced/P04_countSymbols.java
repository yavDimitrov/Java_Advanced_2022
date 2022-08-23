package EXERCISES.LE08_Exercise_Sets_and_Maps_Advanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P04_countSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        TreeMap<Character, Integer> symbolMap = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if(!symbolMap.containsKey(currentChar)){
                symbolMap.put(currentChar, 1);
            } else {
                int currentCharCount = symbolMap.get(currentChar);
                symbolMap.put(currentChar,++currentCharCount);
            }
        }
        for (Map.Entry<Character, Integer> pair : symbolMap.entrySet()) {
            System.out.printf("%s: %d time/s%n", pair.getKey(), pair.getValue());
        }


    }
}
