package day069;

import java.util.concurrent.ThreadLocalRandom;

public class RastgeleApp {

    public static void main(String[] args) {
        IRastgele random= () -> ThreadLocalRandom.current().nextInt(10,100);
        int sayi = random.uret();
        System.out.println("Sayı = "+sayi);
    }

}
