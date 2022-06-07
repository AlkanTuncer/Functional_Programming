package day068;

public record Car(String name, double price) implements Printable {
    @Override
    public void print() {
        System.out.println(this);
    }
}
