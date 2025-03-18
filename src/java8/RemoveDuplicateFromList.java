package java8;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> unique= listOfStrings.stream().distinct().toList();
        //List<String> uniqueStrngs = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);
    }
}
