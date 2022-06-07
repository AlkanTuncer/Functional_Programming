package day068;

public class Main_LambdaPar {
    public static void main(String[] args) {

        IPrint printDog = (f) -> {
            System.out.println(f);
            System.out.println("Hav hav");
            System.out.println(f);
        };

        printThings(printDog);

        printDog.print("*******");
        printDog.print("xxxxxxx");

    }

    public static void printThings(IPrint thing){
        thing.print("----------");
    }
}
