package java8;

import java.util.stream.IntStream;

public class SumAndAverageOfIntArray {
    public static void main(String[] args) {
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        int sum = IntStream.of(a).sum();
        System.out.println(sum);
        double average= IntStream.of(a).average().getAsDouble();
        System.out.println(average);
    }
}
