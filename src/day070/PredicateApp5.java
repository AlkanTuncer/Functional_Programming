package day070;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PredicateApp5 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,7,5,3,4,8,12));

        Map<Boolean, List<Integer>> collect = numbers.stream()
                .collect(Collectors.partitioningBy(cift -> cift % 2 == 0));

        List<Integer> even = collect.get(true);
        List<Integer> odd = collect.get(false);

        System.out.println("-----Çift Sayılar-----");
        even.forEach(System.out::println);   // even.forEach( x -> System.out.println(x));  Lambda ile

        System.out.println("-----Tek Sayılar-----");
        odd.forEach(System.out::println);


    }
}
