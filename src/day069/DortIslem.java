package day069;

import java.util.function.BiFunction;

public class DortIslem {

    public static int topla(int x, int y){
        return x+y;
    }

    public static float topla(float x, float y){
        return x+y;
    }

    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> toplam = DortIslem::topla;
        Integer t = toplam.apply(5,7);
        System.out.println("Toplam = "+t);


        BiFunction<Float,Float,Float> toplamKesirli = DortIslem::topla;
        Float tplm = toplamKesirli.apply(5.3F,5.3f);
        System.out.println("Toplam = "+tplm);

    }
}
