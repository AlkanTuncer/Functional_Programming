package day070;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PredicateApp4 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,7,5,3,4,8,12));
        List<Integer> oddNumbers = new ArrayList<>();

        // imperative - çift sayıların silinmesi
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%2!=0){
                oddNumbers.add(numbers.get(i));
            }
        }

        for (int i = 0; i < oddNumbers.size(); i++) {
            System.out.println(oddNumbers.get(i));
        }

        System.out.println("--------------------------------");
        //numbers.forEach(System.out::println);

        // declarative - çift sayıların silinmesi
        numbers.removeIf((x) -> x%2==0);
        numbers.forEach(System.out::println);

    }
}
