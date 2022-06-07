package day068;

public class Main2 {
    public static void main(String[] args) {

        Araba a1 = new Araba("Toyota");
        arabaSur(a1);
        System.out.println(a1.getName());

    }

    public static void arabaSur(Araba araba){
        System.out.println(araba.getName()+" ilerliyor.");
        //araba.setName("Honda");
    }
}

class Araba {
    private final String name;

    public Araba(String name) {
        this.name = name;
    }
    public void setName(String name){
        //this.name = name;  final oldugu için set edemeyiz.
    }
    public String getName() {
        return name;
    }
}

