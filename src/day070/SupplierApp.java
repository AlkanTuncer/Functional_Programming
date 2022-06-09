package day070;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        // Tick - Timestamp
        Supplier<Long> clockTimer = () -> new Date().getTime();
        Long tick = clockTimer.get();
        System.out.println(tick);

        Supplier<Long> damga = new Supplier<Long>() {
            @Override
            public Long get() {
                return new Date().getTime();
            }
        };
        Long tick2 = damga.get();
        System.out.println(tick2);

        // Metot Referansıyla
        Supplier<Book> book = Book::new;  // ()->new Book();
        System.out.println(book.get());

        // static metot referansıyla
        Supplier<String> id = SupplierApp::generateID;
        System.out.println("ID : "+id.get());

        for (int i = 0; i < 5; i++) {
            System.out.println(id.get());
        }

        // Supplier ile random sayı üretme
        Supplier<Integer> random = ThreadLocalRandom.current()::nextInt;
        for (int i = 0; i < 5; i++) {
            System.out.println(random.get());
        }

    }

    public static String generateID(){
        return UUID.randomUUID().toString();  // GUID veya UUID - Unique ID
    }

}

class Book{
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
