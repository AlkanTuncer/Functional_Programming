package day070;

import java.util.function.Predicate;

public class PredicateApp2 {
    public static void main(String[] args) {

        Predicate<Integer> p = new Predicate<Integer>() {    // p = (number) -> number > 10   Lambda hali
            @Override
            public boolean test(Integer number) {
                return number>10;
            }
        };

        p.test(100); // true - 100 > 10

        boolean test = p.test(100);
        System.out.println("Test : "+test);


        Integer t = 100;
        Predicate<Integer> p1 = n -> n>10;
        Predicate<Integer> p2 = n -> n<20;

        boolean test1 = p1.test(t);    // 100 > 10  true
        boolean test2 = p2.test(t);    // 100 < 20  false

        System.out.println("T1 : "+test1);
        System.out.println("T2 : "+test2);

        // and metodu
        Predicate<Integer> p3 = p1.and(p2);   // n>10 and n<20
        boolean testand = p1.and(p2).test(t);
        boolean testp3 = p3.test(15);

        System.out.println("test and : "+testand);
        System.out.println("test p3 : "+testp3);


        Predicate<Integer> p4 = n -> n>10 & n<20;
        System.out.println("p4 Result : "+p4.test(15));

        // or metodu
        Predicate<Integer> pOr = p1.or(p2);
        System.out.println("test or : "+pOr.test(7));  // 7>10 or 7<20 --- false | true = true

        // nagate metodu - sonucun tersini alır.
        Predicate<Integer> negate = p1.negate();
        System.out.println("T1 Negate : "+negate.test(t));

    }
}
