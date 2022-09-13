package EXERCISES.LE12_Exerciuses_Functional_Programing;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Demo_02 {
    public static void main(String[] args) {

        ToIntFunction<String> toIntFunction = s -> Integer.parseInt(s);

        Function<String, Integer> function = s -> Integer.parseInt(s);

        List<String> numbers = new ArrayList<>();

        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");

        numbers.stream().map(function).forEach(System.out::println);

        numbers.stream().mapToInt(toIntFunction).forEach(System.out::println);
        // Работи с примитиви и има допълнителни опции средно аритметично, мин., макс,

    }
}
