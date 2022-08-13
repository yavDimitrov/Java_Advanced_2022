package LECTURES.L07_Sets_and_Maps_Advanced;

import java.util.*;

public class LiveDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Integer, String> map = new HashMap<>();

        // 3 way to iterate a map

        //Iterate keys
        Set<Integer> integers = map.keySet();


        //iterate key and value
        Set<Integer> integers1 = map.keySet();

        //Iterate values(don't use unless unavoidable
        Collection<String> values = map.values();

    }
}
