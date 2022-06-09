package day070;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        show(1,5);

        show(1,2,3,4,5,17,53,99,113);  // ne kadar istersek yazabiliriz.

        List<Car> carList = getCarList(
                new Car("Audi", "A5"),
                new Car("Audi", "A3"),
                new Car("Audi", "A8")
        );
        System.out.println(carList);

        carList.stream().filter( item -> item.model().equals("A5")).forEach(System.out::println);

    }

    public static void show(int a,int b){
        System.out.printf("%d - %d\n",a,b);
    }


    public static void show(Integer... numbers){
        Arrays.stream(numbers).forEach(System.out::println);
    }

    public static List<Car> getCarList(Car... cars){
        return Arrays.stream(cars).toList();
    }
}

record Car(String name,String model){}