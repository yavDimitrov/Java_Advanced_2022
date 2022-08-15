package LECTURES.L07_Sets_and_Maps_Advanced;

import java.util.*;

public class P04_countRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Double, Integer> map = new LinkedHashMap<>();

        Arrays.stream((scan.nextLine().split("\\s+"))).mapToDouble(Double::parseDouble).forEach(key -> {
            if(map.containsKey(key)){
                // +1 for the value
                int oldCount = map.get(key);
                int newCount = oldCount +1;
                map.put(key, newCount);
            } else {
                map.put(key, 1);
            }
        });

        for (var entry: map.entrySet()  ) {
            System.out.println(String.format("%.1f -> %d", entry.getKey(), entry.getValue()));

        }

    }
}
