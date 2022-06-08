package day069;

public class SumApp {
    public static void main(String[] args) {
/*        ISum islem= (x, y) -> x + y;
        double sum = islem.sum(5, 7);
        System.out.println("Toplam = "+sum);*/


        show((k, l)->k+l,5,9);

    }

    public static void show(ISum iSum,double a,double b){
        System.out.println("Toplam = "+iSum.sum(a,b));
    }
}
