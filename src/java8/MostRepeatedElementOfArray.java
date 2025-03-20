package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElementOfArray {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        Map<String, Long> wordCountMap= listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map.Entry<String,Long> mostFrequentWOrd= wordCountMap.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get();

        System.out.println(mostFrequentWOrd);
    }
}
