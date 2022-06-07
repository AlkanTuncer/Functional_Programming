package day068;

public class Main_Anonim {
    public static void main(String[] args) {

        Printable printableKuzu = new Printable() {
            @Override
            public void print() {
                System.out.println("Meee");
            }
        };

        printThings(printableKuzu);

        printThings(new Printable() {
            @Override
            public void print() {
                System.out.println("Hav hav");
            }
        });

    }

    public static void printThings(Printable thing){
        thing.print();
    }
}
