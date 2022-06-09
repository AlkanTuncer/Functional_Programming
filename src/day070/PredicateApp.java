package day070;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateApp {

    // Verilen parametreye ve tanımlanan koşul fonksiyonuna göre true ya da false değerini döndüren Fonksiyonel Arayüzdür.

    public static void main(String[] args) {

        Predicate<Integer> p1 = (x) -> x > 5 ;
        boolean t1 = p1.test(100);
        System.out.println(t1);

        test(x -> x <= 5 , 10);
        test(p1 , 10);
        test(i -> i%2==0 , 10);
        test(i -> i%2!=0 , 10);

        // Stream
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,8,9,15,21,88));
        List<Integer> cift = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        cift.forEach(System.out::println);

    }

    public static void test(Predicate<Integer> p, int number){
        System.out.println("Result = "+p.test(number));
    }
}
