package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String inputString = "avaJ Concept Of The Day".replaceAll(" ", "").toLowerCase();
        Set<String> unique = new HashSet<>();
        Set<String> duplicate= Arrays.stream(inputString.split("")).filter(c-> ! unique.add(c)).collect(Collectors.toSet());
        System.out.println(duplicate);
        //First unique Character
        String s = Arrays.stream(inputString.split("")).filter(c->! duplicate.contains(c)).findFirst().get();
        System.out.println(s);
    }
}
