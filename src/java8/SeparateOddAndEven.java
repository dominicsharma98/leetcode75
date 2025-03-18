package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateOddAndEven {
    public static void main(String[] args){
        List<Integer> list = List.of(1,2,3,4,5,6,7,7,8,9,99,233,4354,3445);
        separateOddAndEven(list);
    }

    private static void separateOddAndEven(List<Integer> l){
       Map<Boolean, List<Integer>> map = l.stream().collect(Collectors.partitioningBy(i->i%2==0));
        System.out.println(map);
    }
}
