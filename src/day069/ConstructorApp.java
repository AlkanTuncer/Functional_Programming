package day069;

import java.util.function.BiFunction;

public class ConstructorApp {
    public static void main(String[] args) {

        BiFunction<String,Double,Car> c = Car::new;
        Car audi = c.apply("Audi",450_000.0);
        System.out.println(audi);

    }
}
record Car(String name,double price) implements Printable{
    @Override
    public void print(String value) {
        System.out.println(value+" : "+this);
    }
}