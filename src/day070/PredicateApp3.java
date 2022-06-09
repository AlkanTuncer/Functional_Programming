package day070;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateApp3 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,7,5,3,4,8,12));

        BiggerThanFive btf = new BiggerThanFive();
        List<Integer> btfList = numbers
                .stream()
                .filter(btf).
                collect(Collectors.toList());
        btfList.forEach(System.out::println);

    }
}

class BiggerThanFive implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer > 5;
    }
}
