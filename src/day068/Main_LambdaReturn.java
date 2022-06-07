package day068;

public class Main_LambdaReturn {
    public static void main(String[] args) {

        Square kare = (v) -> v * v;
        int calculate = kare.calculate(5);
        System.out.println(calculate);


        Square kare2 = new Square() {     // Yukarıda tek satırda override ettik (:
            @Override
            public int calculate(int value) {
                return value * value;
            }
        };

    }
}
