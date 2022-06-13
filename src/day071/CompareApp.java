package day071;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareApp {
    public static void main(String[] args) {

        List<Integer> listNumbers = new ArrayList<>(
                Arrays.asList(1,7,2,8,3,5)
        );

        listNumbers.sort((o1, o2) -> o1-o2);
        listNumbers.forEach(System.out::println);

    }
}
