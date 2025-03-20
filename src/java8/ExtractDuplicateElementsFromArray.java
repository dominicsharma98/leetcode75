package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractDuplicateElementsFromArray {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> unique= new HashSet<>();

        Set<Integer> duplicates= list.stream().filter(i->! unique.add(i)).collect(Collectors.toSet());
        System.out.println(duplicates);
    }

}
