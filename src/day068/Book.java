package day068;

public record Book(String name, double price) implements Printable {
    @Override
    public void print() {
        System.out.println(this);
    }
}
