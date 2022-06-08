package day069;

public class CompareApp {
    public static void main(String[] args) {

        ICompare comp = (str1, str2) -> str1.equalsIgnoreCase(str2);
        boolean result = comp.compare("Alkan", "Dante");
        System.out.println(result);

        // Metot Referansı ile
        ICompare cmp = String::equalsIgnoreCase;


        print((s1,s2) -> s1.equalsIgnoreCase(s2),"Dante","DANTE");

        System.out.println("-------------------------");

        ICompare ic = new ICompare() {
            @Override
            public boolean compare(String a, String b) {
                return false;
            }
        };

        System.out.println(ic);
        System.out.println(comp);

    }


    public static void print(ICompare ic,String value1,String value2){
        System.out.println(ic.compare(value1,value2));
    }
}
