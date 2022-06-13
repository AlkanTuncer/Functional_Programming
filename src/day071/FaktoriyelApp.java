package day071;

public class FaktoriyelApp {
    public static void main(String[] args) {

        // 5! hesabı
        int f = 1;
        for (int i = 1; i <=5 ; i++) {
            f *= i;
        }
        System.out.println("5! = "+f);

        System.out.println("5! = "+faktoriyelAl(5));
        System.out.println("1! = "+faktoriyelAl(1));
        System.out.println("0! = "+faktoriyelAl(0));

    }

    public static int faktoriyelAl(int x){
        if (x==0 | x==1) return 1;
        return x*faktoriyelAl(x-1);
    }
}
