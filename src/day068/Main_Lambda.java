package day068;

public class Main_Lambda {
    public static void main(String[] args) {

        Printable printableAyi = () -> System.out.println("Roaaarrrr");
        printThings(printableAyi);

        printThings( () -> System.out.println("Hav hav") );

        Printable printableKopek = () -> {
            System.out.println("-".repeat(20));
            System.out.println("HAV HAV");
            System.out.println("-".repeat(20));
        };

        printThings(printableKopek);

    }

    public static void printThings(Printable thing){
        thing.print();
    }
}
