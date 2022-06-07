package day068;

public class Main_InterfaceImplements {
    public static void main(String[] args) {

        printThings(new Car("Audi A5",450_000));
        printThings(new Book("Java 8",5_000));
        printThings(new Animal("Aslan",53.8,7));
        System.out.println();
        new Computer("Asus ROG",2020).print();
        //printThings(new Computer("Asus Rog",2020));  kendi print metodu olsa da Printable olmadığı için bu kod çalışmaz.

    }

    public static void printThings(Printable thing){
        thing.print();
    }
}
