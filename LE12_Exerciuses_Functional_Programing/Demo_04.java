package EXERCISES.LE12_Exerciuses_Functional_Programing;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.IntStream;

public class Demo_04 {
    public static void main(String[] args) {


        List<String> numberList = new ArrayList<>();

        numberList.add("1");
        numberList.add("2");
        numberList.add("3");
        numberList.add("4");

        BiPredicate<Integer, List<String>> BiP = (x, list) -> list.size() > x;

        /*IntStream.rangeClosed(1, 10)
                .filter(x -> BiP.test(x, numberList))
                .filter(x -> x % 2 ==0)
                .forEach(x -> System.out.print(x + " "));*/


    }
}
