package day069;

public class PrintApp {
    public static void main(String[] args) {

        Printable p1 = new Car("Audi",450_000.0);
        p1.print("Dante's Car");
        p1.show();

        System.out.println();

        Printable p2 = new Printable() {
            @Override
            public void print(String value) {
                System.out.println("Merhaba "+value);
            }

            @Override
            public void show() {
                System.out.println("Anonim için gereken bilgiler:");
                System.out.println("-----------------------------");
            }
        };
        p2.print("Dante");
        p2.show();

        System.out.println();

        Printable p3 = x -> System.out.println("Selam "+x);
        p3.print("Dante");
        p3.show();

        System.out.println();

        Printable p4 = System.out::println;
        p4.print("Selamın Aleyküm");
        p4.show();
        p4.draw();
        System.out.println();
        Printable.draw("x ");

    }
}
