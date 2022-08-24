package EXERCISES.LE08_Exercise_Sets_and_Maps_Advanced;

import java.util.*;

public class P07_CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        LinkedHashMap<String, HashSet<String>> players = new LinkedHashMap<>();

        while (!command.equals("JOKER")) {
            String[] commandTokens = command.split(": ");
            String name = commandTokens[0];
            String[] cards = commandTokens[1].split(", ");

            if (!players.containsKey(name)) {
                players.put(name, new HashSet<>());

            }
            for (String card : cards) {
                card = card.trim(); // macha praznite poleta v nachaloto i kraya
                players.get(name).add(card);
            }
            command = scan.nextLine();
        }

        for (var player : players.entrySet()) {
            String playerName = player.getKey();
            int points = calculatePoint(player.getValue());

            System.out.printf("%s: %d%n", playerName, points);

        }

    }

    private static int calculatePoint(HashSet<String> cards) {
        int points = 0;
        for (String card : cards) {
            String power = card.substring(0, card.length() - 1);
            char type = card.charAt(card.length() - 1);

            int cardPoints = getPower(power) *getType(type);
            points += cardPoints;

        }
        return points;
    }

    private static int getPower(String power) {
        switch (power) {
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default:
                return Integer.parseInt(power);
        }
    }

    private static int getType(char type) {
        switch (type) {
            case 'S':
                return 4;
            case 'H':
                return 3;
            case 'D':
                return 2;
            case 'C':
                return 1;
            default:
                return 0;

        }

    }
}
