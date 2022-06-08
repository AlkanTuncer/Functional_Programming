package day069;

public class DrawApp {
    public static void main(String[] args) {

        //Drawable drawLine= System.out::println;

        //drawLine.draw("--------------------");
        //show(drawLine,"*************");
        show(System.out::println,"xxxxxxxxxxxxxxxxx");
    }

    public static void show(Drawable d,String value){
        d.draw(value);

    }
}
