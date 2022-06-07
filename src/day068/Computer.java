package day068;

public record Computer(String vendor,int year) {
    public void print(){
        System.out.println(this);
    }
}
