package EXERCISES.LE08_Exercise_Sets_and_Maps_Advanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P08_userLogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        TreeMap<String, LinkedHashMap<String, Integer>> userMap = new TreeMap<>();

        while(!input.equals("end")){
            String[] inputParts = input.split("\\s+");
            String ipParts = inputParts[0];
            String usernameParts = inputParts[2];
            String userName = usernameParts.substring(5);
            String ipAddress = inputParts[0].substring(3);

            if(!userMap.containsKey(userName)){
                userMap.put(userName, new LinkedHashMap<>());
            }
            if(!userMap.get(userName).containsKey(ipAddress)){
                userMap.get(userName).put(ipAddress,1);
            } else {
                int ipAttacksCounter = userMap.get(userName).get(ipAddress) + 1;
                userMap.get(userName).put(ipAddress, ipAttacksCounter);
            }


            input = scan.nextLine();
        }
        System.out.println();

        for (var attacker : userMap.entrySet()) {
            System.out.printf("%s:%n", attacker.getKey());
            LinkedHashMap<String, Integer> attacks = attacker.getValue();
            StringBuilder sb = new StringBuilder();

            for (var singleIpAttack : attacks.entrySet()){
                String formatedAttack = String.format("%s => %d, ",singleIpAttack.getKey(), singleIpAttack.getValue());
                sb.append(formatedAttack);
            }
            String finalOutput = sb.substring(0, sb.length() -2);
            finalOutput = finalOutput + ".";

            System.out.println(finalOutput);

            
        }
                
    }
}
