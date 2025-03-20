package java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordOfString {
    public static void main(String[] args) {

        String str = "Java Concept Of The Day";
        String s = Stream.of(str.split(" ")).map(w->new StringBuffer(w).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(s);
    }
}
