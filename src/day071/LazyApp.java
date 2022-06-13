package day071;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyApp {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(17,53,92));

        Stream<Integer> integerStream = list.stream().filter(x -> {
            System.out.println(x+" kontrol ediliyor.");
            return x > 50;
        });

        System.out.println("Filtreleme başladı...");
        System.out.println("Sonuç : "+ integerStream.toList());

    }
}
