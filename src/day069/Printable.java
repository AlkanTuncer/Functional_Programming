package day069;

@FunctionalInterface
public interface Printable {

    void print(String value);

    public default void show(){
        System.out.println("Gerekli bilgiler :");
        System.out.println("-".repeat(10));
    }

    public default void draw(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void draw(String value){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

}
