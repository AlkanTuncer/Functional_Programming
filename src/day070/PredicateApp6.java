package day070;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateApp6 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,7,5,3,4,8,12));

        List<Integer> odd = numbers.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());
        odd.forEach(System.out::println);

    }
}
