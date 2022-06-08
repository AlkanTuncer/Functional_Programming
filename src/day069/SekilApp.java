package day069;

public class SekilApp {
    public static void main(String[] args) {
        ISekil sekil= r -> {
            double alan=Math.PI*Math.pow(r,2.0);
            return alan;
        };

        System.out.println("Alan = "+sekil.alanHesapla(7));
    }
}
