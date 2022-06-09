package day070;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PredicateApp7 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,7,5,3,4,8,12));

        boolean b = numbers.stream()
                .allMatch(e -> e >= 0);
        System.out.println("Result : "+b);


        List<String> names = Arrays.asList("Ali","Cem","Can","Cemil");

        boolean b1 = names.stream()
                .allMatch(e -> e.length() == 3);   // Cemil olmasa true

        System.out.println("Result : "+b1);



    }
}
