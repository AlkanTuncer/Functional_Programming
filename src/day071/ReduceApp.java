package day071;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceApp {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        list.forEach(System.out::print);
        System.out.println();

        Integer reduceToplam = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Toplam = "+reduceToplam);

        Integer reduceCarpim = list.stream().reduce(1,(a,b)-> a*b);
        System.out.println("Çarpım = "+reduceCarpim);

    }
}
