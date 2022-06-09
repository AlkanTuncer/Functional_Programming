package day070;

import java.util.function.BiPredicate;

public class BiPredicateApp {
    public static void main(String[] args) {

        BiPredicate<Integer,Integer> big = (x,y) -> x > y ;
        boolean testbig1 = big.test(17, 53); // false
        boolean testbig2 = big.test(53, 17); // true
        System.out.println(testbig1);
        System.out.println(testbig2);


        BiPredicate<String,String> contain = (str1,str2) -> str1.contains(str2);  // String::contains
        boolean test = contain.test("Ben bir garip Keloğlanım", "garip");
        System.out.println(test); // true

    }
}
