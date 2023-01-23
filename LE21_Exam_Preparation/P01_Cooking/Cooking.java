package EXERCISES.LE21_Exam_Preparation.P01_Cooking;

import java.util.*;
import java.util.stream.Collectors;

public class Cooking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> liquids = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();

        Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(ingredients::push);

        Map<String, Integer> cookedFoods = new TreeMap<>();
        cookedFoods.put("Bread", 0);
        cookedFoods.put("Cake", 0);
        cookedFoods.put("Pastry", 0);
        cookedFoods.put("Fruit Pie", 0);

        System.out.println();

        while (!ingredients.isEmpty() && !liquids.isEmpty()) {

            int lastIngredient = ingredients.pop();

            int sum = lastIngredient + liquids.poll();

            String cookedFood;

            switch (sum) {
                case 25:
                    cookedFood = "Bread";
                    break;
                case 50:
                    cookedFood = "Cake";
                    break;
                case 75:
                    cookedFood = "Pastry";
                    break;
                case 100:
                    cookedFood = "Fruit Pie";
                    break;
                default:
                    cookedFood = null;
                    break;
            }


            if (cookedFood != null) {
                int newVal = cookedFoods.get(cookedFood) + 1;
                cookedFoods.put(cookedFood, newVal);
            } else {
                ingredients.push(lastIngredient + 3);
            }

        }

        boolean allFoodsCoked = cookedFoods.entrySet().stream().allMatch(e -> e.getValue() > 0);

        if(allFoodsCoked){
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        }else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");

        }

        String remainingLiquids = liquids.isEmpty() ? "none" : liquids.stream()
                        .map(String::valueOf)
                                .collect(Collectors.joining(", "));

        System.out.println("Ingredients left: "+ remainingLiquids);

       String remainingIngreadients = ingredients.isEmpty() ? "none" : ingredients.stream()
                       .map(String::valueOf).collect(Collectors.joining(", "));

        System.out.println("Ingredients left: " + remainingIngreadients);

        cookedFoods.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
