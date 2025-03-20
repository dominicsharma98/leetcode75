package java8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfAllDigitsOfInt {
    public static void main(String[] args) {
        int i = 15623;
        Integer sum= Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
