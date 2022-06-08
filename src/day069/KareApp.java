package day069;

public class KareApp {

    public static void main(String[] args) {
        showKare((int x) -> x*x,7);
    }

    public static void showKare(IKare ik,int deger){
        System.out.println("Kare = "+ik.kareAl(deger));
    }

}
