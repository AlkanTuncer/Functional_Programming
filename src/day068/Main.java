package day068;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 4;
        int c = a+b;  // Lazy Evaluation


        Aritmetik art = new Aritmetik(5,3);
        int topla = art.topla();
        System.out.println(topla);

    }
}

class Aritmetik{
    private int deger;
    public int topla(int x, int y){
        deger = x+y;  // Side Effect --> Functional Programming bunu kabul etmiyor.
        return deger;
    }

    private final int x;  // FP de bu değerleri final tanımlıcaksın ve constructor'da initialize ediceksin.
    private final int y;  // FP de değiştirilebilir olmucaklar. Immutable

    public Aritmetik(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int topla(){
        return x+y;
    }
}