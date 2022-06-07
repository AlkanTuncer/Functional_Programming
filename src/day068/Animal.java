package day068;

public record Animal(String name, double agirlik, int age) implements Printable {
    @Override
    public void print() {
        System.out.println(this);
    }
}
