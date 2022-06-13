package day071;

public class ConcatApp {
    public static void main(String[] args) {

        Birlestirici birlestirici = (s1, s2) -> s1+s2;
        String str = birlestirici.birlestir("Al", "kan");
        System.out.println(str);

        goster(birlestirici,"Al","kan");

    }

    public static void goster(Birlestirici b, String str1, String str2){
        System.out.println(b.birlestir(str1,str2));
    }
}

@FunctionalInterface
interface Birlestirici{
    String birlestir(String s1, String s2);
}
